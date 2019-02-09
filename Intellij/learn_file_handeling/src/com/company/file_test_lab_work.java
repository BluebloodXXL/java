//This will always delete the existing record in the file and overwrite as a new one
package com.company;

import java.io.*;
import java.util.Scanner;

public class file_test_lab_work {

    public static void main(String[] args) throws Exception {
        // write your code here

        File file = new File ("Out1.txt");
        if(!(file.exists())){   // In the exists you can give path, address of the file
            file.createNewFile();
        }
        PrintWriter fout = new PrintWriter("Out1.txt");
        Scanner input = new Scanner(System.in);
        String str;
        while (!(str = input.nextLine()).equals("---")) {
            fout.println(str);
        }
        fout.close();

    }
}
