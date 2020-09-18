package com.example.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class BaseResp<R> implements Serializable {
    private String message;
    private Integer code;
    private R result;
}
