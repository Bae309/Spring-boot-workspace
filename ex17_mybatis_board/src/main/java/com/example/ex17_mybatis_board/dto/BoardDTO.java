package com.example.ex17_mybatis_board.dto;

import lombok.Data;

@Data
public class BoardDTO {
    private int id;
    private String writer;
    private String title;
    private String content;
}
