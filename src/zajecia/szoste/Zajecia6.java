package zajecia.szoste;

import zajecia.czwarte.ZadaniaZeScannerem;

/**
 * Created by m.losK on 2017-02-07.
 */

public class Zajecia6 {
    public static void main(String[] args) {
        System.out.println(decodeCezarCode("Defg", 3));
    }

    public static String decodeCezarCode(String message, int key){
        return cezarCode(message, -key);
    }
    public static String decodeCezarCode(String message){
        return cezarCode(message, -1);
    }

    public static String cezarCode (String message){
        return cezarCode(message, 1);
    }

    public static String cezarCode (String message, int key){
        char[] messageArray = message.toCharArray();
        for (int i = 0; i < messageArray.length ; i++) {
            messageArray[i]=(char)(messageArray[i]+key);
        }
            return String.valueOf(messageArray);
    }

    public static void calculator() {
        boolean flag = true;
        while (flag) {

            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnozenie");
            System.out.println("4. Dzielenie");

            int numbersFromUser = ZadaniaZeScannerem.getNumberFromUser("Wybierz dzialanie: ");
            int firstNumber = 0;
            int secondNumber = 0;
            if (numbersFromUser > 0 && numbersFromUser < 5) {
                firstNumber = ZadaniaZeScannerem.getNumberFromUser("Podaj pierwsza liczbe: ");
                secondNumber = ZadaniaZeScannerem.getNumberFromUser("Podaj druga liczbe: ");
            }
            switch (numbersFromUser) {
                case 1:
                    System.out.println(firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber));
                    break;
                case 2:
                    System.out.println(firstNumber + "-" + secondNumber + "=" + (firstNumber - secondNumber));
                    break;
                case 3:
                    System.out.println(firstNumber + "*" + secondNumber + "=" + (firstNumber * secondNumber));
                    break;
                case 4:
                    if (secondNumber == 0) {
                        System.out.print("Nie dzielimy przez zero! Podaj ponownie druga liczbe: ");
                        secondNumber = ZadaniaZeScannerem.getNumberFromUser("");
                        System.out.println(firstNumber + "/" + secondNumber + "=" + ((double) firstNumber / secondNumber));
                    } else {
                        System.out.println(firstNumber + "/" + secondNumber + "=" + ((double) firstNumber / secondNumber));
                    }
                    break;
                default:
                    flag = false;
                    System.out.println("Podales zla wartosc. Koniec programu!");
                    break;
            }
            System.out.println();
            System.out.println();
        }
    }

    public static int averageUntil(int sum) {
        int aSum = 0;
        int counter = 0;
        boolean flag = true;
        while (flag) {
            int numbersFromUser = ZadaniaZeScannerem.getNumberFromUser();
            counter++;
            aSum += numbersFromUser;
            if ((double) aSum / counter > sum) {
                flag = false;
            }
        }
        return counter;
    }

    public static int sumUntil(int sum) {
        int aSum = 0;
        int counter = 0;
        boolean flag = true;
        while (flag) {
            int numbersFromUser = ZadaniaZeScannerem.getNumberFromUser();
            counter++;
            aSum += numbersFromUser;

            if (aSum > sum) {
                flag = false;
            }
        }

        return counter;
    }
}
