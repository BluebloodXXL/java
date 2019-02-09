import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Appendfile {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("append.txt", true);

        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter END to finish appending.");
        while (true){
            str = input.nextLine();
            if (str.equals("END")) {
                break;
            }
            byte b[] = str.getBytes();
            fout.write(b);
            fout.write('\n');
        }

        fout.close();
    }
}