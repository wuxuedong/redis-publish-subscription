package org.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题（可以理解为频道）
 */
public class TopicModel {

    /**
     * 模拟数据库存储主题
     */
    public static List<TopicModel> topicModelList = new ArrayList<>();

    private String id;
    private String name;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
