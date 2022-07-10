package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    static double totalReimbursment = 0 ;
    public static void main(String[] args) throws IOException {
        int x = 0 ;
        CreateFile.createFile();

        while(x != 6) {
            Menu.mainMenu();
            Scanner inputMenu = new Scanner(System.in);
            int userInput = inputMenu.nextInt();
            x = userInput;


            switch (x) {
                case 1: {
                    ReimbursmentClaim newreimbursmentClaim = new ReimbursmentClaim();
                    newreimbursmentClaim.reimbursmentClaim();
                    break;
                }
                case 2: {
                    try {
                        File myObj = new File("reimbursment.txt");
                        Scanner myReader = new Scanner(myObj);
                        while (myReader.hasNextLine()) {
                            String currentLine = myReader.nextLine();
                            System.out.println(currentLine);
                        }
                        myReader.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    } break;
                }
                case 3: {
                    Admin admin = new Admin();
                    admin.admin();
                    break;

                }
                case 4: {
                    System.out.println(totalReimbursment);
                }
                case 5: {
                    PrintWriter pw = new PrintWriter("reimbursment.txt");
                    pw.close();
                    totalReimbursment = 0;
                    break;
                }
                case 6: {
                    break;
                }
                default: {
                    System.out.println("error wrong input");
                }
            }
        }
    }
}
