package week6;

import java.io.*;
import java.util.Collections;

/**
 * Created by debasser on 02.07.16.
 */
public class IOReaderWriter {
    public static void main(String[] args) throws IOException {
        InputStream is = new BufferedInputStream(new FileInputStream("/home/debasser/coding/ACO/ACO/week2.txt"));

        int readByte;
        while ((readByte = is.read()) != -1) {
            System.out.print((char) readByte);
        }
        System.out.println(" ");
        Reader rd = new BufferedReader(new FileReader("/home/debasser/coding/ACO/ACO/week2.txt"));
        int readChar;
        while ((readChar = rd.read()) != -1) {
            System.out.print((char) readChar);
        }

    }

}
