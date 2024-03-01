package com.teamphoenix.postreply.reply.query.controller;

import com.teamphoenix.postreply.reply.query.dto.ReplyDTO;
import com.teamphoenix.postreply.reply.query.service.ReplyService1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reply")
@Slf4j
public class ReplyController1 {

    private final ReplyService1 replyService;

    @Autowired
    public ReplyController1(ReplyService1 replyService) {
        this.replyService = replyService;
    }

    @GetMapping("/regist")
    public void registReply(){}

    @PostMapping("/regist")
    public String registReply(ReplyDTO reply) {
        log.info("댓글 등록 테스트: {}", reply);

        replyService.registReply(reply);

        return "등록성공!";
    }
}
