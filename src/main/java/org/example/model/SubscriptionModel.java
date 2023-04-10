package org.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户和主题关系表
 */
public class SubscriptionModel {
    public static List<SubscriptionModel> subscriptionModelList = new ArrayList<>();
    private String id;
    private String userId; // 订阅用户的 ID
    private String topicId; // 订阅主题的 ID

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }
}
