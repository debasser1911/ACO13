package week6.recursion;

/**
 * Created by debasser on 02.07.16.
 */
public class Factorial {
    public static void main(String[] args) {
        int fac = factorial(5);
        System.out.println(fac);
    }

    private static int factorial(int number) {
        if(number <= 1) return 1;
        int count = number * factorial(-1);

        return count;
    }
}
