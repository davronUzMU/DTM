package com.serves;

import com.databace.Databace;
import com.model.Question;

import java.util.UUID;

public class QuestionServes {
    public static String addQuestion(String subject, String questions, Object answer) {
        if(subject==null || subject.isBlank()) return " Fan qo'shish majburiy";
        if(questions==null || questions.isBlank()) return " savol bo'lishi shart:";
        if(answer==null) return " javobni ham yozish kerak";

        Databace.questions.add(new Question(UUID.randomUUID(),subject,questions,answer));
        return "Yangi savol qo'shdingiz";
    }
}
