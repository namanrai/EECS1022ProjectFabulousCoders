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

   /* public void writeToFile(String message) {
        String path = new File("").getAbsolutePath();
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openFileOutput(path + "./app/src/main/java/com/example/finalprojectnewtesting/userdata.txt",
                    Context.MODE_PRIVATE));
            outputStreamWriter.write(message);
            outputStreamWriter.close();

        } catch(FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public boolean readFromFile(String username, String password) {
        Scanner input;
        boolean flag = false;
        try {
            String path = new File("").getAbsolutePath();
            input = new Scanner(new File(path + "./app/src/main/java/com/example/finalprojectnewtesting/userdata.txt"));
            input.useDelimiter(",");

            ArrayList<User> users = new ArrayList<>();
            int index = 0;

            while (input.hasNext()) {
                users.add(index, new User(input.next().replaceAll("\n", "").replaceAll("\r", ""),
                        input.next(), input.next()));
            }
            for (User user: users) {
                if (user.getUsername().equals(username) && (user.getPassword().equals(password))) {
                    flag = true;
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not Found :( (all other fields)");
        }
        return flag;

    }
}

