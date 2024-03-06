package com.teamphoenix.postreply.reply.query.service;

import com.teamphoenix.postreply.reply.query.dto.ReplyDTO;
import com.teamphoenix.postreply.reply.query.repository.ReplyRespository;
import com.teamphoenix.postreply.reply.query.aggregate.Reply;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReplyService1 {

    private final ModelMapper mapper;
    private final ReplyRespository replyRespository;

    @Autowired
    public ReplyService1(ModelMapper mapper, ReplyRespository replyRespository) {
        this.mapper = mapper;
        this.replyRespository = replyRespository;
    }

    @Transactional
    public List<ReplyDTO> registReply(ReplyDTO newReply) {
        replyRespository.save(mapper.map(newReply, Reply.class));
        List<Reply> replies = replyRespository.findAll(Sort.by("replyId").descending());

        return replies.stream().map(reply -> mapper.map(reply, ReplyDTO.class)).collect(Collectors.toList());
    }

    @Transactional
    public ReplyDTO modifyReply(ReplyDTO modifyInfo, int replyId) {
        Reply foundReply = replyRespository.findById(replyId).orElseThrow(IllegalAccessError::new);
        foundReply.setReplyContent(modifyInfo.getReplyContent());
        foundReply = replyRespository.findById(replyId).orElseThrow(IllegalAccessError::new);

        return mapper.map(foundReply, ReplyDTO.class);
    }

    @Transactional
    public List<ReplyDTO> deleteReply(int replyId) {
       replyRespository.deleteById(replyId);

        List<Reply> replies = replyRespository.findAll(Sort.by("replyId").descending());

        return replies.stream().map(reply -> mapper.map(reply, ReplyDTO.class)).collect(Collectors.toList());
    }
}
