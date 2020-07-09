package com.sun_m.bootcamp.controller;

import java.util.ArrayList;

import com.sun_m.bootcamp.entity.User;
import com.sun_m.bootcamp.service.GetUserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class UserController {

        @Autowired
        GetUserServiceImpl getUserServiceImpl = new GetUserServiceImpl();

        @RequestMapping("/users")
        public ArrayList<User> getArrayList() {
                ArrayList<User> list = getUserServiceImpl.getAllUser();
                System.out.println("-----------------------------------------------");
                System.out.println(list);
                System.out.println("-----------------------------------------------");
                System.out.println(list.get(1).getUid());
                return null;
        }

}