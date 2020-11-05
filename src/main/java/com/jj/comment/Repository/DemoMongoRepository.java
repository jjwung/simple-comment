package com.jj.comment.Repository;

import com.jj.comment.dto.DemoDto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DemoMongoRepository extends MongoRepository<DemoDto, String> {
}
