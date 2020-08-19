package com.example.rest;

import com.example.dto.UserReq;
import com.example.dto.UserResp;
import com.example.servlce.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {
    
    @Reference(version = "1.0.0")
    private UserService userService;
    
    @RequestMapping("get")
    public UserResp getUser(UserReq req) {
        return userService.getUsernameById(req);
    }
}
