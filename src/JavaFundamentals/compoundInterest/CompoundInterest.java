package JavaFundamentals.compoundInterest;

/**
 * Created by m.losK on 2017-02-11.
 */
public class CompoundInterest {
    final double STARTRATE = 10;
    private int rates;
    private int years;
    private double[] interestRate;
    private double[][] balances;

    public CompoundInterest() {
        this(5,5);
    }

    public CompoundInterest(int rates, int years) {
        this.rates = rates;
        this.years = years;
    }

    public int getRates() {
        return rates;
    }

    public void setRates(int rates) {
        this.rates = rates;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double getSTARTRATE() {
        return STARTRATE;
    }

    public double[][] getBalances() {
        return this.balances;
    }

    public double[] getInterestRate() {
        return this.interestRate;
    }

    //ustawienie stop oprocentowania na wartosc w przedziale 10-15%
    public double[] settingInterestRates() {
        this.interestRate = new double[rates];
        for (int i = 0; i < interestRate.length; i++) {
            interestRate[i]=(STARTRATE+i)/100.0;
        }
        return interestRate;
    }

    //ustawienie sald poczatkowych na 10 000
    public void setBalances() {
        this.balances = new double[years][rates];
        for (int i = 0; i < balances[0].length; i++) {
            balances[0][i]= 10000;
        }
    }

    public double[][] interestCalculation(double[]interestRate){
        for (int i = 1; i < balances.length ; i++) {
            for (int j = 0; j < balances[i].length; j++) {

                //pobranie sald z minionego roku z poprzedniego wiersza
                double oldBalance = balances[i-1][j];

                //obliczanie odesetek
                double interest = oldBalance*interestRate[j];

                //obliczanie tegorocznego salda
                balances[i][j] = oldBalance + interest;
            }
        }
        return balances;
    }

    public void printOneLineOfInterest(double[]interestRate){
        for (int i = 0; i < interestRate.length; i++) {
            System.out.printf("%9.0f%%", 100*interestRate[i]);
        }
        System.out.println();
    }

    public void printArrayOfBalances(double[][] balances){
        for (double[] row : balances) {
            //wydruk wiersza tebali
            for (double b : row) {
                System.out.printf("%10.2f", b);
            }
            System.out.println();
        }
    }

}
