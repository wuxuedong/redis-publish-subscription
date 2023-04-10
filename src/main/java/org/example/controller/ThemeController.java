package org.example.controller;

import org.example.model.TopicModel;
import org.example.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主题
 */
@RestController
public class ThemeController {

    @Autowired
    private ThemeService themeService;

    /**
     * 增加主题
     * @param topicModel
     * @return 成功信息
     */
    @PostMapping("/addTheme")
    public String addTheme(@RequestBody TopicModel topicModel){
        return themeService.addTheme(topicModel);
    }
}
