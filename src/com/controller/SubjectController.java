package com.controller;

import com.serves.SubjectServes;

public class SubjectController {
    public static String add(String subject) {
        return SubjectServes.add(subject);
    }
}
