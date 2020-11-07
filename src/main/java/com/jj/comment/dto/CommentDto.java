package com.jj.comment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "comment")
public class CommentDto {
    @Id
    private String id;

    // 评论归属：如某歌id，某画id,可以自定义
    private String belongId;

    // 来自用户id
    private String fromUserId;

    // 回复给哪个评论
    private String toCommentId;

    // 评论内容
    private String content;

    // 发布时间
    private String createTime;

    // 最新修改时间，修改评论后，更新时间覆盖
    private String updateTime;

    // 获赞数
    private Integer likeNumber;

    // 获踩数
    private Integer dislikeNumber;

    // 父评论ID，用于统计
    private String fatherCommentId;
}
