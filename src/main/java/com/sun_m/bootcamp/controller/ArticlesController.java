package com.sun_m.bootcamp.controller;

import java.util.List;

import com.sun_m.bootcamp.entity.Articles;
import com.sun_m.bootcamp.repository.ArticlesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
        List<Articles> list = ArticlesRepository.findAll();
        return list;
    }

    @GetMapping("/articles/{id}")
    @ResponseBody
    @CrossOrigin
    public Articles getArticle(@PathVariable("id") int id) {
        Articles obj = ArticlesRepository.getById(id);
        System.out.println(obj);
        return obj;
    }

    @RequestMapping(path = "/post")
    @ResponseBody
    public Articles postArticle(@RequestBody Articles articles) {
        System.out.println("******************************************************");
        articles.setId(20);
        System.out.println(articles);
        System.out.println("******************************************************");
        return ArticlesRepository.save(articles);
    }
}