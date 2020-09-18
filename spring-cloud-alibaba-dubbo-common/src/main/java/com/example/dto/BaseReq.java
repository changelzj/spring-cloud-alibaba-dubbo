package com.example.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class BaseReq<P> implements Serializable {

    private P param;

}
