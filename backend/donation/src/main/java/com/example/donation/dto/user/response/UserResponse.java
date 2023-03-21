package com.example.donation.dto.user.response;

import com.example.donation.domain.user.User;

public class UserResponse {

    private long user_id;
    private String loginid;
    private String password;
    private String name;

    public UserResponse(long user_id, String loginid, String password, String name) {
        this.user_id = user_id;
        this.loginid = loginid;
        this.password = password;
        this.name = name;
    }

    public UserResponse(User user) {
        this.user_id = user.getId();
        this.loginid = user.getLoginid();
        this.password = user.getPassword();
        this.name = user.getName();
    }

    public UserResponse(long user_id, User user) {
        this.user_id = user_id;
        this.loginid = user.getLoginid();
        this.password = user.getPassword();
        this.name = user.getName();
    }

    public long getId() {
        return user_id;
    }

    public String getLoginid() {
        return loginid;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

}
