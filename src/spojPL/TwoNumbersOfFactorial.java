package spojPL;

import java.util.Scanner;

/**
 * Created by Vitalij on 2017-02-10.
 */
public class TwoNumbersOfFactorial {
    public static void main(String[] args)  throws java.lang.Exception {
        int numberOfTests = getNumberFromUser();
        for (int i = 0; i < numberOfTests; i++) {
            int number = getNumberFromUser();
            printTwoNumbersOfFactorial(number);
        }
    }

    public static int getNumberFromUser() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static int factorialOfDigitsRecursion(int number) {
        if (number == 0) return 1;
        else return number * factorialOfDigitsRecursion(number - 1);
    }

    public static void printTwoNumbersOfFactorial(int number){
        if (number <= 1) System.out.printf("%d %d\n", 0, 1);
        else if (number >= 10) System.out.printf("%d %d\n", 0, 0);
        else {
            int digit = factorialOfDigitsRecursion(number);
            System.out.printf("%d %d\n", (digit % 100) / 10, digit % 10);
        }
    }
}