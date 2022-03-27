package com.example.finalprojectnewtesting;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class;
public class SignIn {
    public static void main(String[] args) {
        try {
            String path = new File("").getAbsolutePath();
            System.out.println(path + "app/src/main/java/SignIn.txt");
            File myObj = new File(path + "app/src/main/java/com/example/finalprojectnewtesting/SignIn.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("SignIn.txt");
            myWriter.write("We will change this to read the textbox in the andriod studio not wokring here");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

