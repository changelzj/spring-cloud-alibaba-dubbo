package com.example.rest;

import com.example.dto.UserReq;
import com.example.dto.UserResp;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.servlce.UserService;

@RestController
public class UserApi {
    
    @Reference
    private UserService userService;
    
    @RequestMapping("get")
    public UserResp getUser(UserReq req) {
        return userService.getUsernameById(req);
    }
}
