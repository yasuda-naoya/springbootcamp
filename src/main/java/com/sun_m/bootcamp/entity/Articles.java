package com.sun_m.bootcamp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "articles")
public class Articles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;
    @Column(name = "maincontent")
    private String maincontent;
    @Column(name = "good")
    private int good;
    @Column(name = "bad")
    private int bad;

    public Articles() {
    };

    public Articles(int id, String title, String maincontent, int good, int bad) {
        this.id = id;
        this.title = title;
        this.maincontent = maincontent;
        this.good = good;
        this.bad = bad;
    }
}
