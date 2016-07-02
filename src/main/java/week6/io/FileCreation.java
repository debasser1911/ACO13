package week6.io;

import java.io.File;
import java.io.IOException;

/**
 * Created by debasser on 02.07.16.
 */
public class FileCreation {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/debasser/test.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.delete());
    }
}
