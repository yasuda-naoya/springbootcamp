package com.sun_m.bootcamp.controller;

import java.util.List;

import com.sun_m.bootcamp.entity.User;
import com.sun_m.bootcamp.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class UserController {

        @Autowired
        UserRepository UserRepository;

        @RequestMapping("/users")
        public List<User> getArrayList() {
                List<User> list = UserRepository.findAll();
                System.out.println("-----------------------------------------------");
                System.out.println(list);
                System.out.println("-----------------------------------------------");
                System.out.println(list.get(1).getUid());
                return null;
        }

}