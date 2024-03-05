package com.teamphoenix.postreply.reply.query.controller;

import com.teamphoenix.postreply.reply.query.dto.ReplyDTO;
import com.teamphoenix.postreply.reply.query.service.ReplyService1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.nio.charset.Charset;

@RestController
@RequestMapping("/reply")
@Slf4j
public class ReplyController1 {

    private final ReplyService1 replyService;

    @Autowired
    public ReplyController1(ReplyService1 replyService) {
        this.replyService = replyService;
    }

    @PostMapping("/regist")
    public ResponseEntity<?> registReply(@RequestBody ReplyDTO reply) {
        System.out.println("reply = " + reply);

        replyService.registReply(reply);

        return ResponseEntity
                .created(URI.create("/reply/replieslist/"))
                .build();
    }
}
