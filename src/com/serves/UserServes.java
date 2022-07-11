package com.serves;

import com.databace.Databace;
import com.model.User;

import java.util.UUID;

public class UserServes {
    public static String addUser(String name,String lastname,String password) {
        if(name==null || name.isBlank()){
            return "ism kiritish majburiy";
        }
        if(!name.substring(0,1).startsWith(name.toUpperCase())){
            return "error";
        }
        if(lastname==null || lastname.isBlank()){
            return "ism kiritish majburiy";
        }
        if(!lastname.substring(0,1).startsWith(lastname.toUpperCase())){
            return "error";
        }
        if (password.length()==9) {
            if (password.matches("[A-Z]{2}[0-9]{7}")) {
                User user=new User(UUID.randomUUID(),name,lastname,password,false);
                Databace.users.add(user);
                return name + " registeratsiyadan o'tdingiz";
            }
        }

        Databace.users.add(new User(UUID.randomUUID(),name,lastname,password,false));
        return "user qo'shildi";
    }

    public static String passwordEdit(String name, String lastname, String password,boolean isAdmin) {
        for (User user : Databace.users) {
            if(user.isAdmin()==isAdmin){
                return " siz admin emasssiz";
            }
        }
        for (User user : Databace.users) {
            if(user.getFullname().equals(name) && user.getLastname().equals(lastname)){
                if(user.getPassword().equals(password)){
                    return " parolni o'zgartirmadingiz";
                }else{
                    return password;
                }
            }
        }

        return "yangi password qo'shilmadi";
    }
}
