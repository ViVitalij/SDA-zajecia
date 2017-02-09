package zajecia.osme;

import java.math.BigInteger;

/**
 * Created by m.losK on 2017-02-09.
 */
public class Zajecia8 {
    public static void main(String[] args) {
        System.out.println(fibonacciRecursion(0));
        System.out.println(fibonacciRecursion(1));
        System.out.println(fibonacciRecursion(2));
        System.out.println(fibonacciRecursion(3));
        System.out.println(fibonacciRecursion(4));
    }

    public static int fibonacciRecursion(int index) {
        if (index < 0) {
            return -1;
        } else if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        }
        return fibonacciRecursion(index - 2) + fibonacciRecursion(index - 1);
    }

    public static int fibonacci(int index) {
        int prev = 0;
        int next = 1;
        int result = 0;
        for (int i = 1; i < index; i++) {
            result = prev + next;
            prev = next;
            next = result;
        }
        if (index == 1) {
            result = 1;
        }
        return result;
    }

    public static BigInteger factorialUpgrade(int number) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        if (number == 0)
            return bigInteger.valueOf(1);
        else
            return bigInteger.multiply(factorialUpgrade(number - 1));
    }
}
