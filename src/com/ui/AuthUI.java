package com.ui;

import com.Main;
import com.controller.AuthContriller;
import com.util.ScannerUtil;

public class AuthUI {
    public static void login() {
        System.out.println("Ismingizni kiriting:");
        String fullname= ScannerUtil.SCANNERSTR.nextLine();

        System.out.println(" passwordni kiriting:");
        String password=ScannerUtil.SCANNERSTR.nextLine();

        String result= AuthContriller.login(fullname,password);
    }

    public static void register() {
        System.out.println("Ismingizni kiriting:");
        String fullname= ScannerUtil.SCANNERSTR.nextLine();

        System.out.println("Familiyangizni kiriting:");
        String lastname=ScannerUtil.SCANNERSTR.nextLine();

        System.out.println(" passwordni kiriting:");
        String password=ScannerUtil.SCANNERSTR.nextLine();

        String result=AuthContriller.register(fullname,lastname,password);

    }

    public static void logout() {
        Main.user1=null;
    }
}
