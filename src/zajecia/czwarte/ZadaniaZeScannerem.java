package zajecia.czwarte;

import java.util.Scanner;

public class ZadaniaZeScannerem {
    public static void main(String[] args) {
        System.out.println("Grade system 2000 z.o.o");
        double avg = avgOfGrades();
        System.out.println("Avg of your grades is: " + avg);
    }

    public static double avgOfGrades() {
        int size = getNumberFromUser("Insert number of grades.");
        int[] array = new int[size];
        for(int i = 0 ; i < array.length ; i++) {
            array[i] = getNumberFromUser("Insert " + (i+1) + " grade:");
        }
        return Zajecia4.avg(array);
    }

    public static void compareThreeNumbersFromUser() {
        int a = getNumberFromUser("Insert first number");
        int b = getNumberFromUser("Insert second number");
        int c = getNumberFromUser("Insert third number");

        System.out.println("Max: " + max(a, b, c));
        System.out.println("Min: " + min(a, b, c));
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1 ; i < array.length ; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int a, int b, int c) {
        int[] array = {a, b, c};
        return max(new int[]{a,b,c});
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int a, int b, int c) {
        int[] array = {a, b, c};
        return min(array);
    }

    public static void listNumbersFromUser() {
        int number = getNumberFromUser();
        Zajecia4.printLessThan(number);
    }

    public static void listEvenNumbersFromUser() {
        int number = getNumberFromUser();
        Zajecia4.printEvenLessThan(number);
    }

    public static int getNumberFromUser() {
        return getNumberFromUser("Please insert your number: ");
    }

    public static int getNumberFromUser(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

    public static void checkNumberFromUser() {
        int numberFromUser = getNumberFromUser();
        if (Zajecia4.isEven(numberFromUser)) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }

    public static void scannerExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your name:");
        String name = scanner.nextLine();
        int number = scanner.nextInt();
        System.out.println("Please insert your last name:");
        String lastName = scanner.nextLine();
        System.out.println("Your name is " + name + " " + lastName);
    }
}
