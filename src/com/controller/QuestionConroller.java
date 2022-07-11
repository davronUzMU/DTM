package com.controller;

import com.serves.QuestionServes;

public class QuestionConroller {
    public static String addQuestion(String subject, String questions, Object answer) {
        return QuestionServes. addQuestion(subject,questions,answer);
    }
}
