package com.sun_m.bootcamp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "`users`")
public class Users {
    @Id
    @GeneratedValue
    @Column(name = "uid")
    private int uid;
    @Column(name = "name")
    private String name;

    public Users() {
    };

    public Users(int uid, String name) {
        this.uid = uid;
        this.name = name;
    }
}
