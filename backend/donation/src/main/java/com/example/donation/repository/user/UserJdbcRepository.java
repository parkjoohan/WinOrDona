package com.example.donation.repository.user;

import com.example.donation.dto.user.response.UserResponse;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserJdbcRepository {

    private final JdbcTemplate jdbcTemplate;

    public UserJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean isUserNotExist(long user_id) {
        String readSql = "SELECT * FROM User WHERE user_id = ?";
        return jdbcTemplate.query(readSql, (rs, rowNum) -> 0, user_id).isEmpty();
    }

    public boolean isUserNotExist(String name) {
        String readSql = "SELECT * FROM User WHERE name = ?";
        return jdbcTemplate.query(readSql, (rs, rowNum) -> 0, name).isEmpty();
    }

    public void saveUser(String loginid, String password, String name) {
        String sql = "INSERT INTO User (loginid, password, name) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, loginid, password, name);
    }

    public List<UserResponse> getUsers() {
        String sql = "SELECT * FROM User";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            long user_id = rs.getLong("user_id");
            String loginid = rs.getString("loginid");
            String password = rs.getString("password");
            String name = rs.getString("name");
            return new UserResponse(user_id, loginid, password, name);
        });
    }

    public void updateUserName(String name, long user_id) {
        String sql = "UPDATE User SET name = ? WHERE id = ?";
        jdbcTemplate.update(sql, name, user_id);
    }

    public void deleteUserName(String name) {
        String sql = "DELETE FROM User WHERE name = ?";
        jdbcTemplate.update(sql, name);
    }
}