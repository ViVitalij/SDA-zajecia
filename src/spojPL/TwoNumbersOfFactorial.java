package spojPL;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Vitalij on 2017-02-10.
 */
public class TwoNumbersOfFactorial {
    public static void main(String[] args) {
        int numberOfTests = getNumberFromUser();
        for (int i = 0; i < numberOfTests; i++) {
            int number = getNumberFromUser();
            if (number <= 1) System.out.printf("%d %d\n", 0, 1);
            else if (number >= 10) System.out.printf("%d %d\n", 0, 0);
            else {
                int digit = factorialOfDigitsRecursion(number);
                System.out.printf("%d %d\n", (digit % 100) / 10, digit % 10);
            }
        }
    }

    public static int getNumberFromUser() {
        Scanner in = new Scanner(System.in);
        int l = 0;
        try {
            l = in.nextInt();
        } catch (NoSuchElementException e) {
            System.out.println();
        }
        return l;
    }

    public static int factorialOfDigitsRecursion(int number) {
        if (number == 0) return 1;
        else return number * factorialOfDigitsRecursion(number - 1);
    }
}