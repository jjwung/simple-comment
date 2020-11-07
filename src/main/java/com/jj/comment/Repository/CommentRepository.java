package com.jj.comment.Repository;

import com.jj.comment.dto.CommentDto;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<CommentDto, String> {
    List<CommentDto> findByBelongIdAndFatherCommentId(String belongId, String fatherCommentId);
    List<CommentDto> findByBelongIdAndFatherCommentIdIsNull(String belongId);
}
