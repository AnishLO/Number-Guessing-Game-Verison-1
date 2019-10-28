package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int pickNumber;
        pickNumber = (int) (Math.random()*90)+3;
        do {
            System.out.println("would you like to win an prize?");
            System.out.println("if you do guess the right number you get to pick an prize.");
            keyboard.nextInt();
            // for( int = 0; i <20; i++) (


            pickNumber = (int) (Math.random()*90)+3;
            System.out.println(pickNumber);



        }while (pickNumber>100);



    }

    }

