package com.teamphoenix.postreply.reply.command.entity;

public class Reply {

    private int reply_id;
    private int post_id;
    private String reply_content;
    private String reply_date;
    private int report_acceptance;
    private int use_acceptance;
    private int member_code;

    public Reply() {
    }

    public Reply(int reply_id, int post_id, String reply_content, String reply_date, int report_acceptance, int use_acceptance, int member_code) {
        this.reply_id = reply_id;
        this.post_id = post_id;
        this.reply_content = reply_content;
        this.reply_date = reply_date;
        this.report_acceptance = report_acceptance;
        this.use_acceptance = use_acceptance;
        this.member_code = member_code;
    }

    public int getReply_id() {
        return reply_id;
    }

    public void setReply_id(int reply_id) {
        this.reply_id = reply_id;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public String getReply_content() {
        return reply_content;
    }

    public void setReply_content(String reply_content) {
        this.reply_content = reply_content;
    }

    public String getReply_date() {
        return reply_date;
    }

    public void setReply_date(String reply_date) {
        this.reply_date = reply_date;
    }

    public int getReport_acceptance() {
        return report_acceptance;
    }

    public void setReport_acceptance(int report_acceptance) {
        this.report_acceptance = report_acceptance;
    }

    public int getUse_acceptance() {
        return use_acceptance;
    }

    public void setUse_acceptance(int use_acceptance) {
        this.use_acceptance = use_acceptance;
    }

    public int getMember_code() {
        return member_code;
    }

    public void setMember_code(int member_code) {
        this.member_code = member_code;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "reply_id=" + reply_id +
                ", post_id=" + post_id +
                ", reply_content='" + reply_content + '\'' +
                ", reply_date='" + reply_date + '\'' +
                ", report_acceptance=" + report_acceptance +
                ", use_acceptance=" + use_acceptance +
                ", member_code=" + member_code +
                '}';
    }
}
