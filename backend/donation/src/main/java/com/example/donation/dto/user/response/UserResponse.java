package com.example.donation.dto.user.response;

import com.example.donation.domain.user.User;

public class UserResponse {

    private long id;
    private String loginid;
    private String password;
    private String name;

    public UserResponse(long id, String loginid, String password, String name) {
        this.id = id;
        this.loginid = loginid;
        this.password = password;
        this.name = name;
    }

    public UserResponse(User user) {
        this.id = user.getId();
        this.loginid = user.getLoginid();
        this.password = user.getPassword();
        this.name = user.getName();
    }

    public UserResponse(long id, User user) {
        this.id = id;
        this.loginid = user.getLoginid();
        this.password = user.getPassword();
        this.name = user.getName();
    }

    public long getId() {
        return id;
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
