package org.example.service.Impl;

import org.example.model.SubscriptionModel;
import org.example.service.PublishService;
import org.example.socket.MyWebSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PublishServiceImpl implements PublishService {

    @Autowired
    private MyWebSocket myWebSocket;

    @Override
    public String senMsg(String id,String msg) {
        //根据主题id赛选出用户id
        List<String> userList = SubscriptionModel
                .subscriptionModelList.stream().filter(x -> x.getTopicId().equals(id))
                .map(SubscriptionModel::getUserId)
                .collect(Collectors.toList());
        for (String userId : userList) {
            myWebSocket.sendMessageTo(msg,userId);
        }
        return "success";
    }
}
