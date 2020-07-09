package com.sun_m.bootcamp.entity;

import lombok.Data;

@Data
public class User {
    private int uid;
    private String name;

    public User(int uid, String name) {
        this.uid = uid;
        this.name = name;
    }
}
