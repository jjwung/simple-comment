package com.jj.comment.util;

import com.jj.comment.dto.CommentDto;

/**
 * 参数校验工具类
 */
public class CheckUtils {
    /**
     * 把实体类的空字符串全部转换为null
     * 此目的是为了统一字符串，防止前台传空字符串
     *
     * @param commentDto 评论实体类
     */
    public static void emptyToNull(CommentDto commentDto) {
        if (commentDto.getBelongId() != null && commentDto.getBelongId().equals("")) {
            commentDto.setBelongId(null);
        }
        if (commentDto.getContent() != null && commentDto.getContent().equals("")) {
            commentDto.setContent(null);
        }
        if (commentDto.getCreateTime() != null && commentDto.getCreateTime().equals("")) {
            commentDto.setCreateTime(null);
        }
        if (commentDto.getFatherCommentId() != null && commentDto.getFatherCommentId().equals("")) {
            commentDto.setFatherCommentId(null);
        }
        if (commentDto.getFromUserId() != null && commentDto.getFromUserId().equals("")) {
            commentDto.setFromUserId(null);
        }
        if (commentDto.getId() != null && commentDto.getId().equals("")) {
            commentDto.setId(null);
        }
        if (commentDto.getToCommentId() != null && commentDto.getToCommentId().equals("")) {
            commentDto.setToCommentId(null);
        }
        if (commentDto.getUpdateTime() != null && commentDto.getUpdateTime().equals("")) {
            commentDto.setUpdateTime(null);
        }
    }
}
