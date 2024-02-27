package com.ohgiraffers.test.reply_crud_jpa;

import jakarta.persistence.*;

@Entity(name="reply_crud")
@Table(name="reply")
public class Reply {

    @Id
    @Column(name="reply_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int replyId;

    @Column(name="post_id")
    private int postId;

    @Column(name="reply_content")
    private String replyContent;

    @Column(name="reply_date")
    private String replyDate;

    @Column(name="report_acceptance")
    private int reportAcceptance;

    @Column(name="use_acceptance")
    private int useAcceptance;

    @Column(name="member_code")
    private int memberCode;

    public Reply() {
    }

    public Reply(int replyId, int postId, String replyContent, String replyDate, int reportAcceptance, int useAcceptance, int memberCode) {
        this.replyId = replyId;
        this.postId = postId;
        this.replyContent = replyContent;
        this.replyDate = replyDate;
        this.reportAcceptance = reportAcceptance;
        this.useAcceptance = useAcceptance;
        this.memberCode = memberCode;
    }

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public String getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(String replyDate) {
        this.replyDate = replyDate;
    }

    public int getReportAcceptance() {
        return reportAcceptance;
    }

    public void setReportAcceptance(int reportAcceptance) {
        this.reportAcceptance = reportAcceptance;
    }

    public int getUseAcceptance() {
        return useAcceptance;
    }

    public void setUseAcceptance(int useAcceptance) {
        this.useAcceptance = useAcceptance;
    }

    public int getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "replyId=" + replyId +
                ", postId=" + postId +
                ", replyContent='" + replyContent + '\'' +
                ", replyDate='" + replyDate + '\'' +
                ", reportAcceptance=" + reportAcceptance +
                ", useAcceptance=" + useAcceptance +
                ", memberCode=" + memberCode +
                '}';
    }


}
