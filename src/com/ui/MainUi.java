package com.ui;

import com.Main;
import com.util.ScannerUtil;

public class MainUi {
    public static void run() {
        int operation;
        do {
            operation=Menu();
            if(Main.user1==null) {
                switch (operation) {
                    case 1 :
                        AuthUI.login();
                        break;
                    case 2:
                        AuthUI.register();
                        break;
                    case 3: AuthUI.logout();
                    break;
                }

                if(Main.user1.isAdmin()){
                    UserUI.adminCabinet();
                }
                else{
                    UserUI.userCabinet();
                }
            }
        }while (operation!=0);
    }
    public static  int Menu(){
        System.out.println(" *** Menu *** ");
        System.out.println(" 1-> login :");
        System.out.println(" 2-> register :");
        System.out.println(" 3-> exit:");

        return ScannerUtil.SCANNERNUM.nextInt();
    }
}
