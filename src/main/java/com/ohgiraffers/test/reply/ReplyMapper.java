package com.ohgiraffers.test.reply;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReplyMapper {
    List<Reply> selectAllReply();
}
