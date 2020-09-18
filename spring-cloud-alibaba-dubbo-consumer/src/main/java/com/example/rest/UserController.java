package com.example.rest;

import com.example.dto.BaseResp;
import com.example.dto.User;
import com.example.servlce.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @Reference(version = "1.0.0")
    private UserService userService;
    
    @GetMapping("get/{id}")
    public BaseResp<User> getUser(@PathVariable("id") Integer id) {
        User user = userService.getById(id);
        BaseResp<User> baseResp = new BaseResp<>();
        baseResp.setResult(user);
        return baseResp;
    }
}
