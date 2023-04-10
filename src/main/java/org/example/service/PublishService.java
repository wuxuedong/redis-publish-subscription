package org.example.service;

import org.springframework.stereotype.Service;

@Service
public interface PublishService {
    String senMsg(String id,String msg);
}
