package com.teamphoenix.postreply.reply.query.service;

import com.teamphoenix.postreply.reply.query.dto.ReplyDTO;
import com.teamphoenix.postreply.reply.query.repository.ReplyRespository;
import com.teamphoenix.postreply.reply.query.aggregate.Reply;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public void registReply(ReplyDTO newReply) {
        replyRespository.save(mapper.map(newReply, Reply.class));
    }
}
