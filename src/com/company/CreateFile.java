package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {
    public static  void createFile() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("reimbursment.txt");
        pw.close();
        File file = new File("reimbursment.txt");
        if( file.isFile() == true){}
        else{
            try{
                boolean b = file.createNewFile();
            }
            catch(IOException e){
                System.out.println("Cannot create new file");
            }
        }
    }
}
