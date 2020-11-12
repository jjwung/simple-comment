package com.jj.comment.controller;

import com.jj.comment.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;


/**
 * 文件相关接口
 */
@RestController()
@RequestMapping("/file")
public class FileController {
    @Autowired
    private FileService fileService;

    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile file) {
        String ObjectId = fileService.upload(file);
        return ObjectId;
    }

    @PostMapping("/download")
    public File download(@RequestParam String objectId) {
       File content = fileService.download(objectId);
       return content;
    }
}
