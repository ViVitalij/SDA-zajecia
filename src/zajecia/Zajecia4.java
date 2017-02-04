package zajecia;

/**
 * Created by Szymon on 2017-02-04.
 */
public class Zajecia4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        statistics(array);
    }

    public static void printLessThan(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }

    public static void printEvenLessThan(int number) {
        for (int i = 0; i < number; i += 2) {
            System.out.println(i);
        }
    }

    public static int sumOfLessThan(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static int productOfLessThan(int number) {
        int product = 1;
        for (int i = 1; i <= number; i++) {
            product *= i;
        }
        return product;
    }

    public static double celsiusToFahrenheit(int value) {
        return (value * (9.0 / 5.0)) + 32;
    }

    public static double fahrenheitToCelsius(int value) {
        return (value - 32) / 1.8;
    }


    public static void statistics(int[] array) {
        System.out.println("Avg of elements is: " + avg(array));
        System.out.println("Sum of elements is: " + sumOf(array));
        System.out.println("Product of elements is: " + productOf(array));
        System.out.println("Number of even elements is: " + numberOfEven(array));
        System.out.println("Number of odd elements is: " + numberOfOdd(array));
        //1. srednia elementow
        //2. suma elementow
        //3. iloczyn elementow
        //4. ilosc parzystych elementow
        //5. ilosc nieparzystych elementow
    }

    public static int numberOfOdd(int[] array) {
        return array.length - numberOfEven(array);
    }

    public static int numberOfEven(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i])) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static double avg(int[] array) {
        double avg = (double) sumOf(array) / array.length;
        return avg;
    }

    public static int productOf(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        return product;
    }

    public static int sumOf(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
//
//    public static int sumOfLessThan(int number) {
//
//    }
}

//printf() -> System.out.println("Hello World");