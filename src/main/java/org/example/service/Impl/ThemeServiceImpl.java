package org.example.service.Impl;

import org.example.model.TopicModel;
import org.example.service.ThemeService;
import org.springframework.stereotype.Service;

@Service
public class ThemeServiceImpl implements ThemeService {


    @Override
    public String addTheme(TopicModel topicModel) {
        TopicModel.topicModelList.add(topicModel);
        return "success";
    }
}
