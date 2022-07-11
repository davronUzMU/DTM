package com.ui;

import com.controller.QuestionConroller;
import com.databace.Databace;
import com.model.Question;
import com.util.ScannerUtil;

public class questionUI {
    public static void addQuestion() {
        System.out.println(" fan nomini kiriting:");
        String subject= ScannerUtil.SCANNERSTR.nextLine();

        System.out.println(" Savolni kiriting:");
        String questions=ScannerUtil.SCANNERSTR.nextLine();

        System.out.println("savol javobini kiriting:");
        Object answer=ScannerUtil.SCANNERSTR.nextLine();

        String result= QuestionConroller.addQuestion(subject,questions,answer);
        System.out.println(result);
    }

    public static void showQuestion() {
        for (Question question : Databace.questions) {
            System.out.println(question);
        }
    }

}
