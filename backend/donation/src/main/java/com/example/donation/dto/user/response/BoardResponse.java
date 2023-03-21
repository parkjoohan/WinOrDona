package com.example.donation.dto.user.response;

import com.example.donation.domain.board.Board;

import javax.persistence.Column;

public class BoardResponse {

    private long board_id;
    private String title;
    private String content;
    private long user_uid;
    private String create_time;
    private String update_time;

    public BoardResponse(Board board) {
        this.board_id = board.getBoardId();
        this.title = board.getTitle();
        this.content = board.getContent();
        this.user_uid = board.getUser_uid();
        this.create_time = board.getCreate_time();
        this.update_time = board.getUpdate_time();
    }

    public BoardResponse(long boardId, String title, String content, long userUid, String createTime, String updateTime) {
        this.board_id = board_id;
        this.title = title;
        this.content = content;
        this.user_uid = user_uid;
        this.create_time = create_time;
        this.update_time = update_time;
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

    public long getUser_uid() {
        return user_uid;
    }

    public String getCreate_time() {
        return create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

}
