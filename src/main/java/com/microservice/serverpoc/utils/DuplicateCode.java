package com.microservice.serverpoc.utils;

import com.microservice.serverpoc.model.User;

import java.util.ArrayList;
import java.util.List;

public class DuplicateCode {


    public static List<User> getAllUsers() {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "shiv"));
        list.add(new User(2, "uday"));
        list.add(new User(3, "krishna"));
        return list;
    }


    public static int method1(int a, int b){
        return a+b;
    }
    public static int method2(int a, int b){
        return a+b;
    }
    public static int method3(int a, int b){
        return a+b;
    }
    public static int method4(int a, int b){
        return a+b;
    }
    public static int method5(int a, int b){
        return a+b;
    }
    public static int method6(int a, int b){
        return a+b;
    }
}
