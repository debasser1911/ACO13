package week6.recursion;

import java.math.BigInteger;

/**
 * Created by debasser on 02.07.16.
 */
public class Factorial {
    public static void main(String[] args) {
        long fac = factorial(5);
        System.out.println(fac);
        FactorialUtil fu = new FactorialUtil();
        System.out.println(fu.factorial(20));
    }

    private static long factorial(long number) {
        if (number <= 1) return 1;
        long count = number * factorial(number - 1);

        return count;
    }

    public static class FactorialUtil {
        public BigInteger factorial(int n) {
            BigInteger ret = BigInteger.ONE;
            for (int i = 1; i <= n; ++i) ret = ret.multiply(BigInteger.valueOf(i));
            return ret;
        }
    }
}
