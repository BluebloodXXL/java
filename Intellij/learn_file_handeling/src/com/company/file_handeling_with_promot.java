package com.company;
import java.io.*;

public class file_handeling_with_promot {
    public static void main(String[] args) throws Exception {

        InputStreamReader sin = new InputStreamReader(System.in);
        BufferedReader bin = new BufferedReader(sin);

        String fileName, data;
        int check = 1;
        boolean appendORnot;

        
        System.out.printf("To create a new a file press 0 and to append press 1\n");
        check = Integer.parseInt(bin.readLine());

        System.out.println("Enter the file name you want to edit or create with extension");
        fileName = bin.readLine();

        if(check == 1)
            appendORnot = true;
        else
            appendORnot = false;

        File file = new File(fileName);
        FileWriter fileWriter = new FileWriter(fileName, appendORnot);
        BufferedWriter buffer = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(buffer);

        //the real magic happens now

        while (!(data = bin.readLine()).equals("--/"))
            printWriter.println(data);

        printWriter.close();

    }
}
