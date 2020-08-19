package com.example.servlce.impl;

import com.example.dto.User;
import com.example.dto.UserReq;
import com.example.dto.UserResp;
import org.apache.dubbo.config.annotation.Service;
import com.example.servlce.UserService;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Value("${server.port}")
    private String port;
    
    @Override
    public UserResp getUsernameById(UserReq req) {
        UserResp resp = new UserResp();
        resp.setUser(new User());
        resp.setCode(200);
        resp.setMessage(port + "调用成功");
        return resp;
    }
}
