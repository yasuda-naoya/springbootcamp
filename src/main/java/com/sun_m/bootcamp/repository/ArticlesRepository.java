package com.sun_m.bootcamp.repository;

import com.sun_m.bootcamp.entity.Articles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticlesRepository extends JpaRepository<Articles, Integer> {
    Articles getById(int id);
}