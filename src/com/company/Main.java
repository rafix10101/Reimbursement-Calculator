package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 0 ;

        System.out.println("Hello welcome to menu ");
        System.out.println("chose 1 to create new reimbursement claim ");

        while(x != 3) {


            Scanner inputMenu = new Scanner(System.in);
            int userInput = inputMenu.nextInt();
            x = userInput;


            switch (x) {
                case 1: {


                }

                case 2: {

                }


                case 3: {
                    break;
                }
                default: {
                    System.out.println("error wrong input");
                }
            }
        }
    }
}
