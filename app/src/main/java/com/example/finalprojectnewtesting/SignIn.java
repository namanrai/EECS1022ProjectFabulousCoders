package com.example.finalprojectnewtesting;

import android.content.Context;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class SignIn {
    public void generateFile() {
        try {
            String path = new File("").getAbsolutePath();
            File myObj = new File(path + "./app/src/main/java/com/example/finalprojectnewtesting/userdata.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String path = new File("").getAbsolutePath();
        System.out.println(path);
    }


/*    public static String readFromFile(String username, String password) {
        Scanner input;
        boolean flag = false;
        ArrayList<User> users = new ArrayList<>();
        String path = new File("").getAbsolutePath();
        try {
            path = new File("").getAbsolutePath();
            System.out.println(path);
            input = new Scanner(new File(path + "/app/src/main/java/com/example/finalprojectnewtesting/covid.txt"));
            input.useDelimiter(",");

            int index = 0;

            while (input.hasNext()) {
                users.add(index, new User(input.next().replaceAll("\n", "").replaceAll("\r", ""),
                        input.next(), input.next()));
            }
            System.out.println(users.toString());
        }
        catch (FileNotFoundException e) {
            System.out.println("File not Found :( (all other fields)");
        }
        return users.toString();
    }*/


}

