package week5.io;

import java.io.*;

/**
 * Created by DeBasser on 26.06.2016.
 */
public class InputStreamIntro {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:\\Users\\DeBasser\\Desktop\\learn.txt");
        OutputStream os = new FileOutputStream("C:\\Users\\DeBasser\\Desktop\\learn2.txt");
        int readByte;
        while ((readByte = is.read()) != -1)
            os.write(readByte);
        {
            System.out.print(readByte + " ");
        }

    }
}