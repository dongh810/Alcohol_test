package com.teamphoenix.query;

import com.teamphoenix.postreply.reply.query.entity.Reply;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ReplyTest {

    private static EntityManagerFactory entityManagerFactory;

    private EntityManager entityManager;

    @BeforeAll
    public static void initFactory() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpatest");
    }

    @BeforeEach
    public void initManager() {
        entityManager = entityManagerFactory.createEntityManager();
    }

    @AfterAll
    public static void closeFactory() {
        entityManagerFactory.close();
    }

    @AfterEach
    public void closeManager() {
        entityManager.close();
    }

    @Test
    public void 댓글_조회_테스트() {
        // given
        int replyId = 2;

        // when
        Reply foundReply = entityManager.find(Reply.class, replyId);

        // then
        Assertions.assertNotNull(foundReply);
        Assertions.assertEquals(replyId, foundReply.getReplyId());
        System.out.println("foundReply = " + foundReply);
    }

    @Test
    public void 새로운_댓글_추가_테스트() {

        // given
        Reply reply = new Reply();
        reply.setPostId(2);
        reply.setReplyContent("2번게시물 댓글 추가 TEST!");
        reply.setReplyDate(String.valueOf(LocalDate.now()));
        reply.setReportAcceptance(0);
        reply.setUseAcceptance(1);
        reply.setMemberCode(2);

        // when
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        try{
            entityManager.persist(reply);
            entityTransaction.commit();
        } catch(Exception e) {
            entityTransaction.rollback();
        }

        // then
        Assertions.assertTrue(entityManager.contains(reply));
    }

    @Test
    public void 댓글_내용_수정_테스트() {

        // given
        Reply reply = entityManager.find(Reply.class,4);
        System.out.println("reply = " + reply);

        String replyContentChange = "댓글내용이 수정되었습니다~";

        // when
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        try{
            reply.setReplyContent(replyContentChange);
            entityTransaction.commit();
        } catch(Exception e) {
            entityTransaction.rollback();
        }

        // then
        Assertions.assertEquals(replyContentChange, entityManager.find(Reply.class,4).getReplyContent());
    }

    @Test
    public void 댓글_삭제하기_테스트() {

        // given
        Reply replyToRemove = entityManager.find(Reply.class, 5);

        // when
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        try {
            entityManager.remove(replyToRemove);
            entityTransaction.commit();
        } catch(Exception e) {
            entityTransaction.rollback();
        }

        // then
        Reply removeReply = entityManager.find(Reply.class, 5);
        Assertions.assertEquals(null,removeReply);
    }
}
