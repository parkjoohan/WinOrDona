package com.example.donation.dto.user.request;

public class UserCreateRequest {

    private String loginId;
    private String password;
    private String name;

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
