package com.example.finalprojectnewtesting;

import java.util.Scanner;

public class Utilities {

    public int randNumGen(int range) {
        return (int) (Math.random()*range);
    }
    public int getRange(){
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the range of numbers to guess between");
        return input.nextInt();
    }
    public int getTries(){
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the number of tries you want");
        return input.nextInt();
    }

}
