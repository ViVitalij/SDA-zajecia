package JavaFundamentals.Lottery;

import zajecia.czwarte.ZadaniaZeScannerem;

import java.util.Arrays;

/**
 * Demonstruje zastosowanie tablic.
 * Created by Vitalij on 2017-02-10.
 * based on Cay Horstmann's code
 */
public class LotteryDrawing {
    public static void main(String[] args) {
        int numberOfNumbers = ZadaniaZeScannerem.getNumberFromUser("How many numbers do you need to draw?");
        int highestNumber = ZadaniaZeScannerem.getNumberFromUser("What is the highest number you can draw?");
        int[] numbers = fillAnArray(highestNumber);
        int[] result = drawNumbers(numberOfNumbers, highestNumber, numbers);
        printSortedArray(result);
    }

    public static int[] fillAnArray(int highestNumber) {
        int[] numbers = new int[highestNumber];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;     //++numbers[i];
        }
        return numbers;
    }

    public static int[] drawNumbers(int numberOfNumbers, int highestNumber, int[] numbers) {
        int[] result = new int[numberOfNumbers];
        for (int i = 0; i < result.length; i++) {
            int randomNumber = (int) (Math.random() * highestNumber);
            result[i] = numbers[randomNumber];
            numbers[randomNumber] = numbers[highestNumber - 1];
            highestNumber--;
        }
        return result;
    }

    public static void printSortedArray(int[] result) {
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int r : result) {
            System.out.println(r);
        }
    }
}
