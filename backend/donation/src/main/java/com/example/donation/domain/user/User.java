package com.example.donation.domain.user;

public class User {

    private String loginId;
    private String password;
    private String name;

    public User(String loginId, String password, String name) {
        if(loginId == null || loginId.isBlank()) {
            throw new IllegalArgumentException(String.format("아이디를 확인헤주세요"));
        } else if(password == null || password.isBlank()) {
            throw new IllegalArgumentException(String.format("비밀번호를 확인헤주세요"));
        } else if(name == null || name.isBlank()) {
            throw new IllegalArgumentException(String.format("이름을 확인헤주세요"));
        }

        this.loginId = loginId;
        this.password = password;
        this.name = name;
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
