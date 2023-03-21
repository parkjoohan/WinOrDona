package com.example.donation.repository.board;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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

}
