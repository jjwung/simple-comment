package com.jj.comment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "demo_collection")
public class DemoDto {
    @Id
    private String id;

    // 名称
    private String name;

    // 描述
    private String describe;
}
