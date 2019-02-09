import java.io.*;

public class concate_files {
    public static void main(String[] args) throws Exception {
        int ch;

        FileInputStream fin1 = new FileInputStream("copy.txt");
        FileInputStream fin2 = new FileInputStream("paste.txt");
        FileOutputStream fout3 = new FileOutputStream("file3.txt");
        SequenceInputStream sis1 = new SequenceInputStream(fin1, fin2);

        BufferedInputStream Bin = new BufferedInputStream(sis1);
        BufferedOutputStream Bout = new BufferedOutputStream(fout3);

        while ((ch = Bin.read()) != -1)
            Bout.write(ch);

        fin1.close();
        fin2.close();
        Bin.close();
        Bout.close();
    }
}