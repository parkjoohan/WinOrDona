package com.example.donation.dto.user.request;

public class UserUpdateRequest {

    private long user_id;
    private String name;

    public long getId() {
        return user_id;
    }

    public String getName() {
        return name;
    }
}
