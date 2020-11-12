package com.jj.comment.service;

import com.jj.comment.repository.DemoMongoRepository;
import com.jj.comment.dto.DemoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    private DemoMongoRepository demoMongoRepository;

    public String demo() {
        DemoDto demoDto = new DemoDto(null,"张三","法外狂徒");
        demoMongoRepository.save(demoDto);
        return "存储成功";
    }
}
