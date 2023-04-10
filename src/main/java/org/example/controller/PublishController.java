package org.example.controller;

import org.example.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * 发布消息
 */
@RestController
public class PublishController {

    @Autowired
    private PublishService publishService;

    /**
     * 根据主题id找到用户id推送消息
     * @param id
     * @param msg
     * @return
     */
    @PostMapping("/sendMsg")
    public String sendMsg(@PathParam("id") String id,String msg){
        return publishService.senMsg(id,msg);
    }
}
