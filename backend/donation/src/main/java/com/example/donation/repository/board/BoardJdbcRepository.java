package com.example.donation.repository.board;

import com.example.donation.dto.user.response.BoardResponse;
import com.example.donation.dto.user.response.UserResponse;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardJdbcRepository {

    private final JdbcTemplate jdbcTemplate;

    public BoardJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveBoard(String title, String content, long user_uid, String create_time) {
        String sql = "INSERT INTO User (title, content, user_uid, create_time) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, title, content, user_uid, create_time);
    }

    public List<BoardResponse> getBoard() {
        String sql = "SELECT * FROM Board";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            long board_id = rs.getLong("board_id");
            String title = rs.getString("title");
            String content = rs.getString("content");
            long user_uid = rs.getLong("user_uid");
            String create_time = rs.getString("create_time");
            String update_time = rs.getString("update_time");
            return new BoardResponse(board_id, title, content, user_uid, create_time, update_time);
        });
    }

}
