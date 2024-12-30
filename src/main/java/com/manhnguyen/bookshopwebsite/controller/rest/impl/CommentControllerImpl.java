package com.manhnguyen.bookshopwebsite.controller.rest.impl;

import com.manhnguyen.bookshopwebsite.controller.rest.ICommentController;
import com.manhnguyen.bookshopwebsite.controller.rest.base.VsResponseUtil;
import com.manhnguyen.bookshopwebsite.dto.CommentDto;
import com.manhnguyen.bookshopwebsite.entity.Comment;
import com.manhnguyen.bookshopwebsite.service.CommentService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CommentControllerImpl implements ICommentController {

    CommentService commentService;

    @Override
    public ResponseEntity<?> getCommentHistory() {
        return VsResponseUtil.ok(HttpStatus.OK, commentService.getAll());
    }


    @MessageMapping("/comment")
    @SendTo("/blog/comments")
    public Comment sendComment(CommentDto comment) {
        return commentService.saveComment(comment.getContent(), comment.getBlogId(), comment.getUserId());
    }

}
