package com.jj.comment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 点赞或点踩记录
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "like_or_dislike")
public class LikesDto {
    @Id
    private String id;

    // 喜欢&讨厌的人
    private String userId;

    // 喜欢or讨厌
    private Boolean like;

    // 喜欢&讨厌的时间
    private String startTime;

}
