package com.example.servlce;

import com.example.dto.UserReq;
import com.example.dto.UserResp;

public interface UserService {
    UserResp getUsernameById(UserReq req);
}
