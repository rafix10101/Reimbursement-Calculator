package com.company;

import static com.company.LimitsAndRatio.*;
import java.util.Scanner;

public class Admin {
    public void admin(){
        int x = 0;
        int y = 0;
        System.out.println("Password:");
        String password = "!QAZxsw2";
        Scanner passwordMenu = new Scanner(System.in);
        String passwordInput = passwordMenu.nextLine();

        if (password.equals(passwordInput)) {

            while (x != 4) {
                Menu.adminMenu();
                Scanner inputMenu = new Scanner(System.in);
                int userInput = inputMenu.nextInt();
                x = userInput;


                switch (x) {
                    case 1: {
                        System.out.println("Submit day/$ ratio - currne: " + getDayRate());
                        Scanner adminInput = new Scanner(System.in);
                        int adminValue = adminInput.nextInt();
                        setDayRate(adminValue);
                        break;
                    }
                    case 2: {
                        System.out.println("Submit mile/$ ratio - currne: )" + getMilesRate());
                        Scanner adminInput = new Scanner(System.in);
                        int adminValue = adminInput.nextInt();
                        setMilesRate(adminValue);
                        break;
                    }
                    case 3: {
                        while (y != 8) {
                            Menu.adminLimitsMenu();
                            Scanner limitMenu = new Scanner(System.in);
                            int limitnput = limitMenu.nextInt();
                            y = userInput;


                            switch (y) {
                                case 1: {
                                    break;
                                }
                                case 2: {
                                    break;
                                }
                                case 3: {
                                    break;
                                }
                                case 5: {
                                    break;
                                }
                                case 6: {
                                    break;
                                }
                                case 7: {
                                    break;
                                }
                                case 8: {
                                    break;
                                }
                                default: {
                                    System.out.println("error wrong input");
                                }
                            }
                        }
                    }
                    break;

                            case 4: {
                                break;
                            }
                            default: {
                                System.out.println("error wrong input");
                            }
                        }
                    }
            }
        else System.out.println("wrong password");
    }
}

