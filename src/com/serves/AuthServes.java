package com.serves;

import com.Main;
import com.databace.Databace;
import com.model.User;

import java.util.UUID;

public class AuthServes {
    public static String login(String firstName, String passportNumber) {
        String result = checkParameters(firstName, "lastname", passportNumber);
        if (result!=null) return result;

        for (User user : Databace.users) {
            if(user.getPassword().equals(passportNumber)){
                Main.user1=user;
                return firstName+" kabinetga marxamat";
            }
        }

        return "Passport raqam xato kiritildi:";
    }
    public static String register(String firstName, String lastname, String passportNumber) {
        String result = checkParameters(firstName, lastname, passportNumber);
        if (result != null) return result;

        for (User user : Databace.users) {
            if(user.getPassword().equals(passportNumber)){
                return passportNumber + " is already registreted";
            }
        }

        if (passportNumber.length()==9) {
            if (passportNumber.matches("[A-Z]{2}[0-9]{7}")) {
                User user=new User(UUID.randomUUID(),firstName,lastname,passportNumber,false);
                Databace.users.add(user);
                return firstName + " registeratsiyadan o'tdingiz";
            }
        }
        return passportNumber + " is ERROR";
    }
    private static String checkParameters(String firstName, String lastname, String passportNumber) {
        if (firstName == null || firstName.isBlank()) return "firstName is required";
        if (lastname == null || lastname.isBlank()) return "lastName is required";
        if (passportNumber == null || passportNumber.isBlank()) return "Password is required";

        return null;
    }
}
