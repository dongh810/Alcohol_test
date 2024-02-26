package com.ohgiraffers.test.reply;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
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

    @DisplayName("전체 댓글 조회 테스트")
    @Test
    void testSelectAllReply() {
        List<Reply> replies = selectReplyService.selectAllReply();
        System.out.println(replies);

        assertThat(replies.size()).isEqualTo(3);

    }

    @DisplayName("게시글 별 전체 댓글 조회 테스트")
    @ParameterizedTest
    @ValueSource(ints = 1)
    void testSelectAllReplyInBoard(int postId) {
        List<Reply> replies = selectReplyService.selectAllReplyInBoard(postId);

        assertThat(replies.size()).isEqualTo(2);

    }


}
