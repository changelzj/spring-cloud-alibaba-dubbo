package com.example.servlce.impl;

import com.example.servlce.UserService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUsernameById(Long id) {
        return null;
    }
}
