import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy1_2_another {
    public static void main(String[] args) throws Exception {
        int ch;

        FileInputStream fin = new FileInputStream("copy.txt");
        FileOutputStream fout = new FileOutputStream("paste.txt");

        while ((ch = fin.read()) != (-1))
            fout.write(ch);

        if (fin != null) fin.close();
        if (fout != null) fout.close();

    }
}