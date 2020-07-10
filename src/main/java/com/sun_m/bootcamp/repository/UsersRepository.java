package com.sun_m.bootcamp.repository;

import java.util.List;

import com.sun_m.bootcamp.entity.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
    List<Users> findAll();
}