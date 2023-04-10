package org.example.controller;

import io.lettuce.core.dynamic.annotation.Param;
import org.example.model.SubscriptionModel;
import org.example.service.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 关系表，订阅操作
 */
@RestController
public class SubscribeController {

    @Autowired
    private SubscribeService subscribeService;

    /**
     * 订阅，用户和主题进行绑定
     * @param subscriptionModel
     */
    @RequestMapping("/addSubscription")
    public String addSubscription(@RequestBody SubscriptionModel subscriptionModel){
        return subscribeService.addSubscription(subscriptionModel);
    }

}
