package zajecia.piate;

import zajecia.czwarte.ZadaniaZeScannerem;

/**
 * Created by m.losK on 2017-02-06.
 */
public class Zajecia5 {
    public static void main(String[] args) {
//       int[] array = {1, 2, 3, 4, 5, 6};
//      even(5);
//      listElements(array);
//      even(array);
//      lessThan(7);
//      lessThanEven(9);
//      System.out.println(sum(array));
//      System.out.println(product(array));
//      System.out.println(min(array));
//      System.out.println(max(array));
//      tree(5);
//      evenMatrix(4);
//      oneMatrix(5);
//      System.out.println("suma wynosi: "+sumOfNumbersFromUser());
//        arrayOfNumbersFromUser();
//        printArray();
    game(50);
    }

    public static void listElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public static void even(int[] number) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                System.out.println(number[i]);
            }
        }
    }

    public static void lessThan(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(i);
        }
    }

    public static void lessThanEven(int number) {
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (sum);
    }

    public static int product(int[] array) {
        int product = array[0];
        for (int i = 1; i < array.length; i++) {
            product *= array[i];
        }
        return (product);
    }

    public static int max(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];

        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

//    drukowanie korony drzewa
    public static void tree(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//    drukowanie konaru drzewa
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

    public static void evenMatrix(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if ((i + j) % 2 == 0) System.out.print(1);
                else System.out.print(0);
            }
            System.out.println();
        }
    }

    public static void oneMatrix(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == j) System.out.print(1);
                else System.out.print(0);
            }
            System.out.println();
        }
    }

    public static int sumOfNumbersFromUser(){
        int sum=0;
        boolean flag = true;
        while(flag){
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Insert next number: ");
            if(numberFromUser !=0) {
                sum+= numberFromUser;
            } else{
                flag = false;
            }
        }
        return sum;
    }

    public static int[] arrayOfNumbersFromUser() {
        int[] tmpArray = new int[100];
        int size = 0;
        boolean flag = true;
        while(flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            if(numberFromUser !=0) {
                tmpArray[size] = numberFromUser;
                size++;
            }   else {
                flag = false;
            }
        }
        return revriteArray(tmpArray, size);
    }
    public static int[] revriteArray(int [] bigArray, int size) {
        int [] array = new int[size];
        for (int i=0; i<size; i++) {
            array[i] = bigArray[i];
        }
        return array;
    }
    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void game(int number){
        boolean flag=true;
        while(flag){
           int numberFromUser=ZadaniaZeScannerem.getNumberFromUser();
            if(numberFromUser==number){
                System.out.println("Brawo!");
            } else if (numberFromUser<number){
            }
        }
    }
}
