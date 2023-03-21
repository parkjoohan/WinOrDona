package com.example.donation.dto.user.request;

public class BoardCreateRequest {

    private String title;
    private String content;
    private Long user_uid;
    private String create_time;

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Long getUser_uid() {
        return user_uid;
    }

    public String getCreate_time() {
        return create_time;
    }
}
