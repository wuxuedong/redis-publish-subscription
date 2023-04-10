package org.example.service;

import org.example.model.TopicModel;
import org.springframework.stereotype.Service;

@Service
public interface ThemeService {
    String addTheme(TopicModel topicModel);
}
