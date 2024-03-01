package com.ohgiraffers.test.reply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reply")
public class ReplyController {

    ReplyService replyService;

    @Autowired
    public ReplyController(ReplyService replyService) {
        this.replyService = replyService;
    }

    @GetMapping("/member/{memberId}")
    public List<Reply> selectReplyByWriter(@PathVariable int memberId) {
        return replyService.selectReplyByWriter(memberId);
    }

    @GetMapping("/board/replies/{boardId}")
    public List<Reply> selectAllReplyInBoard(@PathVariable int boardId) {
        return replyService.selectAllReplyInBoard(boardId);
    }

    @GetMapping("/board/search/{inputValue}")
    public List<Reply> selectReplyBySearch(@PathVariable String inputValue) {
        return replyService.selectReplyBySearch(inputValue);
    }



}
