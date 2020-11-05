package com.jj.comment.service;

import com.jj.comment.Repository.CommentRepository;
import com.jj.comment.Repository.DemoMongoRepository;
import com.jj.comment.dto.CommentDto;
import com.jj.comment.dto.DemoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    /**
     * 查询评论列表
     *
     * @return
     */
    public List<CommentDto> getList(String belongId) {
        List<CommentDto> commentDtoList = commentRepository.findByBelongId(belongId);
        return commentDtoList;
    }

    /**
     * 发表评论
     *
     * @param commentDto
     * @return
     */
    public String save(CommentDto commentDto) {
        commentRepository.save(commentDto);
        return "存储成功";
    }


}
