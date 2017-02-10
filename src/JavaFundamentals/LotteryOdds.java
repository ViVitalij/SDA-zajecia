package JavaFundamentals;

import zajecia.czwarte.ZadaniaZeScannerem;

/**
 * Program demonstruje zastosowanie petli <code>for</code>.
 * Created by m.losK on 2017-02-10.
 * based on Cay Horstmann's code
 */
public class LotteryOdds {
    public static void main(String[] args) {
        int numberOfNumbers = ZadaniaZeScannerem.getNumberFromUser("How many numbers do you need to draw? ");
        int highestNumber = ZadaniaZeScannerem.getNumberFromUser("What is the highest number you can draw? ");
        long lotteryOdds = calculatingLotteryOdds(numberOfNumbers, highestNumber);
        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");

    }

    public static long calculatingLotteryOdds(int numberOfNumbers, int highestNumber) {
        long lotteryOdds = 1;
        for (int i = 1; i <= numberOfNumbers; i++) {
            lotteryOdds = lotteryOdds * (highestNumber - i + 1) / i;
        }
        return lotteryOdds;
    }
}
