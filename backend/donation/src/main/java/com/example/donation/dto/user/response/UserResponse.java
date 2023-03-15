package com.example.donation.dto.user.response;

import com.example.donation.domain.user.User;

public class UserResponse {

    private long id;
    private String loginId;
    private String password;
    private String name;

    public UserResponse(long id, String loginId, String password, String name) {
        this.id = id;
        this.loginId = loginId;
        this.password = password;
        this.name = name;
    }

    public UserResponse(long id, User user) {
        this.id = id;
        this.loginId = user.getLoginId();
        this.password = user.getPassword();
        this.name = user.getName();
    }

    public long getId() {
        return id;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

}
