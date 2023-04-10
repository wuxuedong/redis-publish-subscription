package org.example.service.Impl;

import org.example.model.UserModel;
import org.example.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String addUser(UserModel userModel) {
        UserModel.userModelList.add(userModel);
        return "success";
    }
}
