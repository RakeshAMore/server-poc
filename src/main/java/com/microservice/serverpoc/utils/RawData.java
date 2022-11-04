package com.microservice.serverpoc.utils;

import com.microservice.serverpoc.model.User;

import java.util.ArrayList;
import java.util.List;

public class RawData {

    public static List<User> getAllUsers() {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "shiv"));
        list.add(new User(2, "uday"));
        list.add(new User(3, "krishna"));
        return list;
    }
}
