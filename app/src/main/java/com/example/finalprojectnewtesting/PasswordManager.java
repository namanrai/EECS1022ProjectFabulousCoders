package com.example.finalprojectnewtesting;

import java.util.ArrayList;

public class PasswordManager {
    public static void main(String[] args) {
        ArrayList arrayToStore = encryptPassword("passwordlmao");
        System.out.println(arrayToStore);
        System.out.println(decryptPassword(arrayToStore));
    }

    public static ArrayList encryptPassword(String pass){
        ArrayList chars = new ArrayList(pass.length());
        for (int i = 0; i < pass.length(); i++) {
            chars.add(((int) pass.charAt(i))*5);
        }
        return chars;
    }

    public static ArrayList decryptPassword(ArrayList pass){
        for (int i = 0; i < pass.size(); i++) {
            pass.set(i,(char) ((int) pass.get(i)/5));
        }
        return pass;
    }
}
