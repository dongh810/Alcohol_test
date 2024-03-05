package com.teamphoenix.postreply.reply.query.repository;

import com.teamphoenix.postreply.reply.query.aggregate.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRespository extends JpaRepository<Reply, Integer> {
}
