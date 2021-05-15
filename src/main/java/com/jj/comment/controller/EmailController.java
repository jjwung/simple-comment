package com.jj.comment.controller;

import com.jj.comment.entity.User;
import com.jj.comment.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/verify")
    public boolean verify(@RequestBody User user) {
        return emailService.verify(user.getEmail());
    }
}
