package com.example.donation.domain.board;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Board {

    @Id
    @Column(name = "board_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    @Column(nullable = false, length = 50)
    private String title;
    @Column(nullable = false, length = 100)
    private String content;
    @Column(nullable = false)
    private Long user_uid;

    private String create_time;
    private String update_time;

    protected Board() {}

    public Board(String title, String content, Long user_uid, LocalDateTime create_time) {
        this.title = title;
        this.content = content;
        this.user_uid = user_uid;
        this.create_time = String.valueOf(create_time);
    }

    public void updateBoard(String title, String content, LocalDateTime update_time) {
        this.title = title;
        this.content = content;
        this.update_time = String.valueOf(update_time);
    }

    public Long getBoardId() {
        return boardId;
    }

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

    public String getUpdate_time() {
        return update_time;
    }
}
