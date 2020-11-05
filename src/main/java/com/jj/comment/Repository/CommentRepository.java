package com.jj.comment.Repository;

import com.jj.comment.dto.CommentDto;
import com.jj.comment.dto.DemoDto;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<CommentDto, String> {
    List<CommentDto> findByBelongId(String belongId);
}
