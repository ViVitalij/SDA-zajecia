package JavaFundamentals.compoundInterest;

/**Demonstruje przechowywanie danych tabelarycznych w tablicy dwuwymiarowej
 * Created by m.losK on 2017-02-11.
 * based on Cay Horstmann's code
 */
public class CompoundInterestTest {
    public static void main(String[] args) {
        CompoundInterest compoundInterest = new CompoundInterest(2, 2);

        double[]interestRates = compoundInterest.settingInterestRates();
        compoundInterest.setBalances();
        double[][]balances = compoundInterest.interestCalculation(interestRates);
        compoundInterest.printOneLineOfInterest(interestRates);
        compoundInterest.printArrayOfBalances(balances);

        System.out.println();

        CompoundInterest compoundInterest2 = new CompoundInterest();
        double[]interestRates2 = compoundInterest2.settingInterestRates();
        compoundInterest2.setBalances();
        double[][]balances2 = compoundInterest2.interestCalculation(interestRates2);
        compoundInterest2.printOneLineOfInterest(interestRates2);
        compoundInterest2.printArrayOfBalances(balances2);
    }
}
