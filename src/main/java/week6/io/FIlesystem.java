package week6.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by debasser on 02.07.16.
 */
public class FIlesystem {
    public static void main(String[] args) throws IOException {
        File file = new File("/");
        System.out.println(file.getAbsolutePath() + "$ ");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String path = bf.readLine();
        File newFile = new File(path);
        System.out.println(newFile.getAbsolutePath() + "$ ");

        if (newFile.isDirectory()) {
            File[] files = newFile.listFiles();

            for (File file1 : files) {
                System.out.println(file1.getAbsolutePath());
            }
        }
    }
}
