package com.sun_m.bootcamp.controller;

import java.util.List;

import com.sun_m.bootcamp.entity.Articles;
import com.sun_m.bootcamp.repository.ArticlesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticlesController {

    @Autowired
    ArticlesRepository ArticlesRepository;

    @GetMapping("/articles")
    @ResponseBody
    @CrossOrigin
    public List<Articles> getAllArticles() {
        System.out.println("1-----------------------------------------------");
        List<Articles> list = ArticlesRepository.findAll();
        System.out.println("2-----------------------------------------------");
        System.out.println("3-----------------------------------------------");
        return list;
    }

    @GetMapping("/articles/{id}")
    @ResponseBody
    @CrossOrigin
    public Articles getArticle(@PathVariable("id") int id) {
        System.out.println("1-----------------------------------------------");
        Articles obj = ArticlesRepository.getById(id);
        System.out.println(obj);
        System.out.println("2-----------------------------------------------");
        System.out.println("3-----------------------------------------------");
        return obj;
    }

}