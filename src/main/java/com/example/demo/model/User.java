package com.example.demo.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private int id;
    private String name;
    private String sex;
    private String email;

    public User() {

    }

    public User(int id, String name, String sex, String email) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.email = email;
    }
}
