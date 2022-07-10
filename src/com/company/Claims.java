package com.company;

import java.io.*;
import java.util.Scanner;

import static com.company.LimitsAndRatio.*;

public class Claims extends Main{
    public  void daysOfWork() throws IOException {

        System.out.println("Type how many days of work");
        Scanner daysOfWorkInput = new Scanner(System.in);
        int daysOfWorkInt = daysOfWorkInput.nextInt();
        double daysOfWorkCost = daysOfWorkInt * getDayRate();

        File file = new File("reimbursment.txt");
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
        br.append(daysOfWorkInt + " days of work cost - " + daysOfWorkCost + "$");
        br.newLine();
        br.close();
        fr.close();


        totalReimbursment += daysOfWorkCost;
    }
    public  void milesClaim() throws IOException {

        System.out.println("Type how many miles you want to subbmit");
        Scanner milesInput = new Scanner(System.in);
        int miles = milesInput.nextInt();
        double milesCost = miles * getMilesRate();


        File file = new File("reimbursment.txt");
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
        br.append(miles + " miles cost - " + Math.round(milesCost) + "$");
        br.newLine();
        br.close();
        fr.close();


        totalReimbursment += Math.round(milesCost);
    }
    public  void planeTicetClaim() throws IOException {

        System.out.println("Subbmit plane ticet costs");
        Scanner planeTicetInput = new Scanner(System.in);
        int planeTicet = planeTicetInput.nextInt();

        File file = new File("reimbursment.txt");
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
        br.append(" plane ticet cost - " + (int) planeTicet + "$");
        br.newLine();
        br.close();
        fr.close();

        totalReimbursment += planeTicet;
    }
    public  void hotelClaim() throws IOException {

        System.out.println("Total hotel spendings");
        Scanner hotelInput = new Scanner(System.in);
        int hotelCost = hotelInput.nextInt();

        File file = new File("reimbursment.txt");
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
        br.append(" hotel cost - " + hotelCost + "$");
        br.newLine();
        br.close();
        fr.close();


        totalReimbursment += hotelCost;
    }
    public  void personalClaim() throws IOException {

        System.out.println("Total hotel spendings");
        Scanner personalInput = new Scanner(System.in);
        int personalCost = personalInput.nextInt();

        File file = new File("reimbursment.txt");
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
        br.append(" food and personal spending cost  - " + personalCost + "$");
        br.newLine();
        br.close();
        fr.close();


        totalReimbursment += personalCost;
    }
    public  void transportClaim() throws IOException {

        System.out.println("Total taxi and public transport spendings");
        Scanner transportInput = new Scanner(System.in);
        int transportCost = transportInput.nextInt();

        File file = new File("reimbursment.txt");
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
        br.append(" food and personal spending cost  - " + transportCost + "$");
        br.newLine();
        br.close();
        fr.close();


        totalReimbursment += transportCost;
    }


    public  void otherClaim() throws IOException {

        System.out.println("Subbmit other costs");
        Scanner otherInput = new Scanner(System.in);
        int otherCost = otherInput.nextInt();

        File file = new File("reimbursment.txt");
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
        br.append(" other cost - " + otherCost + "$");
        br.newLine();
        br.close();
        fr.close();


        totalReimbursment += otherCost;
    }




}
