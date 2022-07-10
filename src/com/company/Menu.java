package com.company;

public class Menu{
    public static void mainMenu() {
        System.out.println("Menu ");
        System.out.println("1. Create new reimbursement claim ");
        System.out.println("2. Show reimbursement claims history ");
        System.out.println("3. Enter admin mode");
        System.out.println("4. Show total reimbursement  ");
        System.out.println("5. Clear reimbursement claims history ");
        System.out.println("6. Exit ");
    }
    public static void claimMenu() {
        System.out.println("New reimbursement claim");
        System.out.println("1. Add days of work  ");
        System.out.println("2. Add Car millage  ");
        System.out.println("3. Add plane ticket cost  ");
        System.out.println("4. Add hotel cost ");
        System.out.println("5. Add food and personal spending cost  ");
        System.out.println("6. Add taxi and other public transport cost ");
        System.out.println("7. Add other costs  ");
        System.out.println("8. Exit ");
    }
    public static void adminMenu() {
        System.out.println("Admin options");
        System.out.println("1. Change day/$ ratio ");
        System.out.println("2. Change mile/$ ratio ");
        System.out.println("3. Change limits ");
        System.out.println("4. Exit ");
    }
    public static void adminLimitsMenu() {
        System.out.println("Limits");
        System.out.println("1. Change limit for Day ");
        System.out.println("2. Change limit for Miles");
        System.out.println("3. Change limit for Plain ");
        System.out.println("4. Change limit for Hotel ");
        System.out.println("5. Change limit for Food");
        System.out.println("6. Change limit for Trnasport ");
        System.out.println("7. Change limit for Other ");
        System.out.println("8. Exit ");

    }
}

