package com.example.ex10_validation_utils;

import lombok.Data;

// 어노테이션 자동으로 주기 : Alt + Shift + O

@Data
public class ContentDTO {
    private int id;
    private String writer;
    private String content;
}
