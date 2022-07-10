package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReimbursmentClaim {
    public void reimbursmentClaim() throws IOException {
        int x = 0 ;
        while(x != 8) {
            Menu.claimMenu();
            Scanner inputMenu = new Scanner(System.in);
            int userInput = inputMenu.nextInt();
            x = userInput;


            switch (x) {
                case 1: {
                    Claims claimDaysOfWork = new Claims();
                    claimDaysOfWork.daysOfWork();
                    break;
                }
                case 2: {
                    Claims milesClaimUse = new Claims();
                    milesClaimUse.milesClaim();
                    break;
                }
                case 3: {
                    Claims planeTicetClaimUse = new Claims();
                    planeTicetClaimUse.planeTicetClaim();
                    break;
                }
                case 4: {
                    Claims hotelClaimUse = new Claims();
                    hotelClaimUse.hotelClaim();
                    break;
                }
                case 5: {
                    Claims personalClaimUse = new Claims();
                    personalClaimUse.personalClaim();
                    break;
                }
                case 6: {
                    Claims transportClaimUse = new Claims();
                    transportClaimUse.transportClaim();
                    break;
                }
                case 7: {
                    Claims otherClaimUse = new Claims();
                    otherClaimUse.otherClaim();
                    break;
                }
                case 8: {
                    break;
                }
                default: {
                    System.out.println("error wrong input please chose from 1-8");
                }
            }
        }
    }
    }
