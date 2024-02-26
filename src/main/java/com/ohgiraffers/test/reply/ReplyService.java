package com.ohgiraffers.test.reply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyService {

    private ReplyMapper replyMapper;

    @Autowired
    public ReplyService(ReplyMapper replyMapper) {
        this.replyMapper = replyMapper;
    }

    public List<Reply> selectAllReply() {
        List<Reply> replies = replyMapper.selectAllReply();
        replies.forEach(System.out::print);

        return replies;
    }
}
