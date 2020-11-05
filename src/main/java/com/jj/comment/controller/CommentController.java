package com.jj.comment.controller;

import com.jj.comment.dto.CommentDto;
import com.jj.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/list/{belongId}")
    public List<CommentDto> demo(@PathVariable("belongId") String belongId) {
        List<CommentDto> commentList = commentService.getList(belongId);
        return commentList;
    }

    @PostMapping("/save")
    public String demo(@RequestBody CommentDto commentDto) {
        String commentRes = commentService.save(commentDto);
        return commentRes;
    }
}
