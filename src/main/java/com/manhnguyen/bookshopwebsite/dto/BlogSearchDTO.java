package com.manhnguyen.bookshopwebsite.dto;


import lombok.Data;
import lombok.Getter;

@Data
public class BlogSearchDTO {
    private Long userId;
    private String keyword;
}
