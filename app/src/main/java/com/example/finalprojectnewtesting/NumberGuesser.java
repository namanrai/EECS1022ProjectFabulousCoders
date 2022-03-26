package com.example.finalprojectnewtesting;/*
package com.example.lab1;

import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {

        //various constructors
        Scanner input =  new Scanner(System.in);
        Utilities utilities = new Utilities();
        GameSettings setup = new GameSettings(utilities.getRange(), utilities.getTries());

        //set the secret number using random number generator
        setup.setAnswer(utilities.randNumGen(setup.getRange()));

        System.out.println("this is a test, but the answer is " + setup.getAnswer());

        for (int i = 0; i < setup.getTries(); i++) {
            System.out.println("Ok, time to guess what the number between 1 and " + setup.getRange() + " is");
            setup.setGuess(input.nextInt());

            if (setup.getGuess() == setup.getAnswer()) {
                System.out.println("Correct");
                i = setup.getTries();
                System.out.println("You win the game good job");
            } else {
                System.out.println("Wrong");
            }
        }
    }
    //test
}
*/
