package com.manhnguyen.bookshopwebsite.service;

import com.manhnguyen.bookshopwebsite.entity.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> getAll();
    Comment saveComment(String content, Long blogId, Long userId);

    List<Comment> findByBlogIdOrderByCreatedAtDesc(Long blogId);
}
