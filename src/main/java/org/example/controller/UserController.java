package org.example.controller;

import org.apache.catalina.User;
import org.example.model.TopicModel;
import org.example.model.UserModel;
import org.example.service.ThemeService;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主题
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 增加用户
     * @param userModel
     * @return 成功信息
     */
    @PostMapping("/addUser")
    public String addUser(@RequestBody UserModel userModel){
        return userService.addUser(userModel);
    }
}
