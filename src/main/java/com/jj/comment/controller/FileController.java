package com.jj.comment.controller;

import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSDownloadStream;
import com.mongodb.client.gridfs.model.GridFSFile;
import org.apache.commons.io.IOUtils;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * 文件相关接口
 */
@RestController()
@RequestMapping("/file")
public class FileController {
    @Autowired
    private GridFsTemplate gridFsTemplate;

//    @Autowired
//    private GridFSBucket gridFSBucket;

    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile file) throws IOException {
        // 文件类型
        String contentType = file.getContentType();

        // MD5...

        // 存进文件系统
        ObjectId objectId = gridFsTemplate.store(file.getInputStream(), file.getName(), contentType);

        return objectId.toString();
    }

/*
    @PostMapping("/download")
    public String download(String objectId) {
        GridFSFile gridFSFile = gridFsTemplate.findOne(Query.query(Criteria.where("_id").is(objectId)));
        GridFSDownloadStream gridFSDownloadStream = gridFSBucket.openDownloadStream(gridFSFile.getObjectId());
        GridFsResource gridFsResource = new GridFsResource(gridFSFile, gridFSDownloadStream);
        String content = null;
        try {
            InputStream inputStream = gridFsResource.getInputStream();
            content = IOUtils.toString(inputStream, "utf-8");

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(content);
        return content;
    }*/
}
