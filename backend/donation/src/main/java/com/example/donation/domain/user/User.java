package com.example.donation.domain.user;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;
    @Column(nullable = false, length = 25)
    private String loginid;
    @Column(nullable = false, length = 25)
    private String password;
    @Column(nullable = false, length = 25)
    private String name;

    protected User() {}

    public User(String loginid, String password, String name) {
        if(loginid == null || loginid.isBlank()) {
            throw new IllegalArgumentException(String.format("아이디를 확인헤주세요"));
        } else if(password == null || password.isBlank()) {
            throw new IllegalArgumentException(String.format("비밀번호를 확인헤주세요"));
        } else if(name == null || name.isBlank()) {
            throw new IllegalArgumentException(String.format("이름을 확인헤주세요"));
        }

        this.loginid = loginid;
        this.password = password;
        this.name = name;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public Long getId() {
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
