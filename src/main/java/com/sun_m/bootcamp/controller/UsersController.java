package com.sun_m.bootcamp.controller;

import java.util.List;

import com.sun_m.bootcamp.entity.Users;
import com.sun_m.bootcamp.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

        @Autowired
        UsersRepository UsersRepository;

        @GetMapping("/users")
        @ResponseBody
        @CrossOrigin
        public List<Users> getUser() {
                System.out.println("1-----------------------------------------------");
                List<Users> list = UsersRepository.findAll();
                System.out.println("2-----------------------------------------------");
                System.out.println(list.get(0).getName());
                System.out.println("3-----------------------------------------------");
                return list;
        }

}