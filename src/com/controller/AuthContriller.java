package com.controller;

import com.serves.AuthServes;

public class AuthContriller {

    public static String login(String fullname, String password) {
        return AuthServes.login(fullname,password);
    }

    public static String register(String fullname, String lastname, String password) {
        return AuthServes.register(fullname,lastname,password);
    }
}
