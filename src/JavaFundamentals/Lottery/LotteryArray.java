package JavaFundamentals.Lottery;

/**
 * Demonstruje sposob tworzenia tablicy trojkatnej
 * Created by m.losK on 2017-02-12.
 * based on Cay Horstmann's code
 */
public class LotteryArray {
    public static void main(String[] args) {
        int[][] odds = fillTriangularArray(produceTriangularArray());
        printTriangularArray(odds);
    }

    public static int[][] produceTriangularArray() {
        final int NMAX = 10;
        int[][] odds = new int[NMAX + 1][];
        for (int n = 0; n <= NMAX; n++) {
            odds[n] = new int[n + 1];
        }
        return odds;
    }

    public static int[][] fillTriangularArray(int[][] odds) {
        for (int n = 0; n < odds.length; n++) {
            for (int k = 0; k < odds[n].length; k++) {
                /*
                 * obliczanie wspolczynnika dwumianowego n*(n-1)*(n-2)*..*(n-k+1)/(1*2*3*..*k)
                 */
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++) {
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;
                }
                odds[n][k] = lotteryOdds;
            }
        }
        return odds;
    }

    //drukowanie tablicy trojkatnej
    public static void printTriangularArray(int[][] odds) {
        for (int[] row : odds) {
            for (int odd : row) {
                System.out.printf("%4d", odd);
            }
            System.out.println();
        }
    }
}
