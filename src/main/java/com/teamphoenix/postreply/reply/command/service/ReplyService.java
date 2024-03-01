package com.teamphoenix.postreply.reply.command.service;

import com.teamphoenix.postreply.reply.command.entity.Reply;
import com.teamphoenix.postreply.reply.command.repository.ReplyMapper;
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
        replies.forEach(System.out::println);

        return replies;
    }

    public List<Reply> selectAllReplyInBoard(int postId) {
        List<Reply> replies = replyMapper.selectAllReplyInBoard(postId);
        replies.forEach(System.out::println);

        return replies;
    }

    public List<Reply> selectReplyBySearch(String searchingValue) {
        List<Reply> replies = replyMapper.selectReplyBySearch(searchingValue);
        replies.forEach(System.out::println);

        return replies;
    }

    public List<Reply> selectReplyByWriter(int memberId) {
        List<Reply> replies = replyMapper.selectReplyByWriter(memberId);
        replies.forEach(System.out::println);

        return replies;
    }
}
