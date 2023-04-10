package org.example.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户
 */
public class UserModel implements Serializable {

    /**
     * 模拟数据库存储用户
     */
    public static List<UserModel> userModelList = new ArrayList<>();
    private String id;
    private String name;

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
}
