package com.ohgiraffers.test.reply;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
@SpringBootTest
class ReplyServiceTest {

    @Autowired
    private ReplyService selectReplyService;

//    private static List<Integer> getPostId() {
//
//    }

    @DisplayName("게시글 별 전체 댓글 조회 테스트")
    @Test
    void testSelectAllReply() {
        List<Reply> a = selectReplyService.selectAllReply();
        System.out.println(a);

        assertThat(a.size()).isEqualTo(3);

    }


}
