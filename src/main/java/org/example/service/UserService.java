package org.example.service;

import org.example.model.UserModel;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    String addUser(UserModel userModel);
}
