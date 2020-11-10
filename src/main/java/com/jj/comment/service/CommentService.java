package com.jj.comment.service;

import com.jj.comment.Repository.CommentRepository;
import com.jj.comment.dto.CommentDto;
import com.jj.comment.util.CheckUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 评论业务层
 */
@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    /**
     * 查询评论列表
     *
     * @return 一级评论或二级评论
     */
    public List<CommentDto> getList(String belongId, String fatherCommentId) {
        List<CommentDto> commentDtoList = commentRepository.findByBelongIdAndFatherCommentId(belongId, fatherCommentId);
        // 看null会不会报空指针异常，如果不会就这样，如果会报则按照if筛选
        return commentDtoList;
    }

    /**
     * 发表评论
     *
     * @param commentDto 评论实体
     * @return 存储后的实体（含生成ID）
     */
    public String save(CommentDto commentDto) {
        // 将""换为null，以免spring-data查询的时候筛选有问题
        CheckUtils.emptyToNull(commentDto);
        CommentDto save = commentRepository.save(commentDto);
        return "存储的数据：" + save;
    }

}
