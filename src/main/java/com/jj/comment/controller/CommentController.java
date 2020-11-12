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

    /**
     * 查询评论列表
     * 1.查询一级评论：fatherCommentId为空
     * 2.查询二级评论：fatherCommentId不为空
     *
     * @param belongId 归属id
     * @return 评论列表实体
     */
    @GetMapping("/list/{belongId}/{fatherCommentId}")
    public List<CommentDto> list(
            @PathVariable("belongId") String belongId,
            @PathVariable("fatherCommentId") String fatherCommentId
    ) {
        List<CommentDto> commentList = commentService.getList(belongId, fatherCommentId);
        return commentList;
    }

    /**
     * 发表服务
     *
     * @param commentDto 评论接收实体
     * @return 存储后的实体（含生成ID）
     */
    @PostMapping("/save")
    public String save(@RequestBody CommentDto commentDto) {
        String commentRes = commentService.save(commentDto);
        return commentRes;
    }
}
