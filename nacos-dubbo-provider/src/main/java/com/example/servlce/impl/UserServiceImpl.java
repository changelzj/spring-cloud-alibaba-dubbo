package com.example.servlce.impl;

import com.example.dto.UserReq;
import com.example.dto.UserResp;
import org.apache.dubbo.config.annotation.Service;
import com.example.servlce.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserResp getUsernameById(UserReq req) {
        UserResp resp = new UserResp();
        resp.setCode(200);
        resp.setMessage("调用成功");
        return resp;
    }
}
