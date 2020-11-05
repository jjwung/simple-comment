package com.jj.comment.service;

import com.jj.comment.dao.DemoMongoRepository;
import com.jj.comment.dto.DemoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    private DemoMongoRepository demoMongoRepository;

    public String demo() {
        DemoDto demoDto = new DemoDto("1","王大锤","万万没想到，最后我还是和小美在一起了");
        demoMongoRepository.save(demoDto);
        return "存储成功";
    }
}
