//package com.teamphoenix.postreply.reply;
//
//import com.teamphoenix.postreply.reply.command.entity.Reply;
//import com.teamphoenix.postreply.reply.command.service.ReplyService;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//@SpringBootTest
//class ReplyServiceTest {
//
//    @Autowired
//    private ReplyService selectReplyService;
//
////    private static List<Integer> getPostId() {
////
////    }
//
//    @DisplayName("전체 댓글 조회 테스트")
//    @Test
//    void testSelectAllReply() {
//        List<Reply> replies = selectReplyService.selectAllReply();
//        System.out.println(replies);
//
//        assertThat(replies.size()).isEqualTo(3);
//
//    }
//
//    @DisplayName("게시글 별 전체 댓글 조회 테스트")
//    @ParameterizedTest
//    @ValueSource(ints = 1)
//    void testSelectAllReplyInBoard(int postId) {
//        List<Reply> replies = selectReplyService.selectAllReplyInBoard(postId);
//
//        assertThat(replies.size()).isEqualTo(2);
//
//    }
//
//    @DisplayName("댓글 검색기능 테스트")
//    @ParameterizedTest
//    @ValueSource(strings = "2번")
//    void testSelectReplyBySearch(String inputValue) {
//        List<Reply> replies = selectReplyService.selectReplyBySearch(inputValue);
//
//        assertTrue(replies.size() != 0 );
//    }
//
//    @DisplayName("회원별 작성댓글 조회 테스트")
//    @ParameterizedTest
//    @ValueSource(ints = 2)
//    void testSelectReplyByWriter(int memberId) {
//        List<Reply> replies = selectReplyService.selectReplyByWriter(memberId);
//
//        assertTrue(replies.size() != 0 );
//    }
//
//
//}
