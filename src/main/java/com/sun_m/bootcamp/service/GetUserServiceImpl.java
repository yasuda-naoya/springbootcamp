package com.sun_m.bootcamp.service;

import java.util.ArrayList;

import com.sun_m.bootcamp.entity.User;

import org.springframework.stereotype.Service;

@Service
public class GetUserServiceImpl implements GetUserService {
    @Override
    public ArrayList<User> getAllUser() {
        User User = new User(1, "小川三光");
        User User2 = new User(2, "安田直也");
        ArrayList<User> tempList = new ArrayList<User>();
        tempList.add(User);
        tempList.add(User2);
        return tempList;
    };

}