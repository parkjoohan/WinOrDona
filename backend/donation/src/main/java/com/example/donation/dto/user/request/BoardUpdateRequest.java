package com.example.donation.dto.user.request;

public class BoardUpdateRequest {

    private long board_id;
    private String title;
    private String content;
    private String update_time;

    public long getBoard_id() {
        return board_id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getUpdate_time() {
        return update_time;
    }
}
