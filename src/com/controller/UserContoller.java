package com.controller;

import com.serves.UserServes;

public class UserContoller {
    public static String addUser(String name,String lastname,String password) {
        return UserServes.addUser(name,lastname,password);
    }

    public static String passwordEdit(String name, String lastname, String password,boolean isAdmin) {
        return UserServes.passwordEdit(name,lastname,password,isAdmin);
    }
}
