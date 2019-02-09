import java.io.*;
import java.util.Scanner;

public class basic_0 {
    public static void main(String[] args) throws Exception {

        File F = null;
        FileOutputStream apnFile = null;
        PrintWriter pwrite = null;

        Scanner sin = new Scanner(System.in);
        System.out.println("Enter File Name: ");
        String str, file_name = sin.nextLine();

        F = new File(file_name);

        if (F.exists()) {
            System.out.println("File already Exists, now appending");

            apnFile = new FileOutputStream(file_name, true);

            while (!(str = sin.nextLine()).equals("</p>")) {
                byte b[] = str.getBytes();
                apnFile.write(b);
            }
            apnFile.close();

        } else {

            pwrite = new PrintWriter(F);
            //Scanner sin = new Scanner(System.in);

            while (!(str = sin.nextLine()).equals("</p>"))
                pwrite.println(str);

            pwrite.close();

        }
    }
}