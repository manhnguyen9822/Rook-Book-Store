package com.manhnguyen.bookshopwebsite.repository;

import com.manhnguyen.bookshopwebsite.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByBlogIdOrderByCreatedAtDesc(Long blogId);

}
