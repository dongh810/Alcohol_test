package com.teamphoenix.postreply.reply.query.repository;

import com.teamphoenix.postreply.reply.query.entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRespository extends JpaRepository<Reply, Integer> {
}
