package week6.recursion;

/**
 * Created by debasser on 02.07.16.
 */
public class RecursionIntro {
    public static void main(String[] args) {
        a(5);
    }

    private static void a(int i) {
        if(i == 0) return;
        a(i - 1);
        System.out.println(i);
    }
}
