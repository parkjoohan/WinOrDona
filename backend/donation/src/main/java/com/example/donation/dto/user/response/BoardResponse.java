package com.example.donation.dto.user.response;

import com.example.donation.domain.board.Board;

import javax.persistence.Column;

public class BoardResponse {

    private long board_id;
    private String title;
    private String content;
    private String create_time;
    private String update_time;
    private Integer delete_state;

    public BoardResponse(Board board) {
        this.board_id = board.getBoard_id();
        this.title = board.getTitle();
        this.content = board.getContent();
        this.create_time = board.getCreate_time();
        this.update_time = board.getUpdate_time();
    }

    public Long getBoard_id() {
        return board_id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getCreate_time() {
        return create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public Integer getDelete_state() {
        return delete_state;
    }
}
