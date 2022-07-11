package com.ui;

import com.controller.SubjectController;
import com.databace.Databace;
import com.model.Subject;
import com.util.ScannerUtil;

public class SubjectUI {
    public static void add() {
        System.out.println("Fan nomini kiriting:");
        String subject= ScannerUtil.SCANNERSTR.nextLine();

        String result= SubjectController.add(subject);
        System.out.println( result);
    }

    public static void show() {
        for (Subject subject : Databace.subjects) {
            System.out.println(subject);
        }
    }
}
