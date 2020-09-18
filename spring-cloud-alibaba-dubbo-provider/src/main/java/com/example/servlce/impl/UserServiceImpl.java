package com.example.servlce.impl;

import com.example.dto.User;
import com.example.servlce.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Value("${server.port}")
    private String port;

    @Override
    public User getById(Integer id) {
        User user = new User();
        user.setId(1);
        user.setUsername("ltt");int i = 1/0;
        return user;
    }
}
