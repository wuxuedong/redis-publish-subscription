package org.example.service.Impl;

import org.example.model.SubscriptionModel;
import org.example.service.SubscribeService;
import org.springframework.stereotype.Service;

@Service
public class PubSubServiceImpl implements SubscribeService {

    @Override
    public String addSubscription(SubscriptionModel subscriptionModel) {
        SubscriptionModel.subscriptionModelList.add(subscriptionModel);
        return "success";
    }
}
