package org.example.service;

import org.example.model.SubscriptionModel;
import org.springframework.stereotype.Service;

@Service
public interface SubscribeService {
    String addSubscription(SubscriptionModel subscriptionModel);
}
