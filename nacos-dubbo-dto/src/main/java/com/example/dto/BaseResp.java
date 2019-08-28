package com.example.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResp implements Serializable {
    private String message;
    private Integer code;
}
