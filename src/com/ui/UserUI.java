package com.ui;

import com.controller.UserContoller;
import com.databace.Databace;
import com.model.User;
import com.util.ScannerUtil;

public class UserUI {
    public static void adminCabinet() {
        int operation;
        do {
            operation=adminMenu();
            switch (operation) {
                case 1 -> SubjectUI.add();
                case 2 -> SubjectUI.show();
                case 3 -> questionUI.addQuestion();
                case 4 -> questionUI.showQuestion();
                case 5 -> UserUI.addUser();
                case 6 -> UserUI.showUser();
                case 7 -> UserUI.passwordEdit();
                case 8 -> AuthUI.logout();
            }
        }while (operation!=0);

    }

    private static void showUser() {
        for (User user : Databace.users) {
            System.out.println(user);
        }
    }

    private static void passwordEdit() {
        System.out.println("Ism kiriting:");
        String name=ScannerUtil.SCANNERSTR.nextLine();

        System.out.println(" Familiya kiriting");
        String lastname=ScannerUtil.SCANNERSTR.nextLine();

        System.out.println("password kiriting:");
        String password=ScannerUtil.SCANNERSTR.nextLine();

        System.out.println("Tekshirish:");
        boolean isAdmin=false;
        String result= UserContoller.passwordEdit(name,lastname,password,isAdmin);
    }

    private static void addUser() {
        System.out.println("Ism kiriting:");
        String name=ScannerUtil.SCANNERSTR.nextLine();

        System.out.println(" Familiya kiriting");
        String lastname=ScannerUtil.SCANNERSTR.nextLine();

        System.out.println("password kiriting:");
        String password=ScannerUtil.SCANNERSTR.nextLine();

        String result= UserContoller.addUser(name,lastname,password);
    }

    public static void userCabinet() {

    }
    public  static  int adminMenu(){
        System.out.println("   ");
        System.out.println(" 1.Fan qo'shish");
        System.out.println(" 2.Fanlar ro'yxatini ko'rish");
        System.out.println(" 3.Savol qo'shish");
        System.out.println(" 4.Savollar ro'yxatini ko'rish");
        System.out.println(" 5.foydalanuvchi qo'shish");
        System.out.println(" 6.Foydalanuvchilar jo'yxatini ko'rish");
        System.out.println(" 7.O'ziga tegishli parolni o'zgartirish");
        System.out.println(" 8.Exit");

        return ScannerUtil.SCANNERNUM.nextInt();
    }
    public static int userMenu(){
        System.out.println("  ");
        System.out.println(" 1.Fanni tanlash"); // oldin unga ro'yxat chiqsin;
        System.out.println(" 2.Savollar xaqida malumot chiqsin"); // qaysi fanligi va max bal...
        System.out.println(" 3.Balni ko'rish"); // olgan balini ki'rish

        return ScannerUtil.SCANNERNUM.nextInt();
    }
}
