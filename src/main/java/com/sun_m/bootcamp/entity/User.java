package com.sun_m.bootcamp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "uid")
    private int uid;
    @Column(name = "name")
    private String name;

    public User(int uid, String name) {
        this.uid = uid;
        this.name = name;
    }

}
