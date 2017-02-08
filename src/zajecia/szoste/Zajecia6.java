package zajecia.szoste;

import zajecia.czwarte.ZadaniaZeScannerem;

import java.util.*;
import java.util.Map.Entry;

/**
 * Created by m.losK on 2017-02-07.
 */

public class Zajecia6 {
    public static void main(String[] args) {
        lowerCaseLetterPrinter(lowerCaseLetterCounter("Lorum Ipsum"));
    }

    public static void upgradeCharPrinter(TreeMap<Character, Integer> treemap) {
        NavigableMap<Character, Integer> treemapincl = new TreeMap<Character, Integer>();
        treemapincl = treemap.subMap('a', true, 'z', true);

        //wyswietlanie podmapy od a-z
        for (Entry<Character, Integer> entry : treemapincl.entrySet()) {
            Character character = entry.getKey();
            Integer value = entry.getValue();
            System.out.printf("%s %s\n", character, value);
        }

        //wyswietlanie podmapy A-Z
        NavigableMap<Character, Integer> treemapinclAZ = new TreeMap<Character, Integer>();
        treemapinclAZ = treemap.subMap('A', true, 'Z', true);

        for (Entry<Character, Integer> entry : treemapinclAZ.entrySet()) {
            Character litera = entry.getKey();
            Integer value = entry.getValue();
            System.out.printf("%s %s\n", litera, value);
        }
    }

    public static TreeMap<Character, Integer> upgradeCharCounter(String message) {
        TreeMap<Character, Integer> treemap = new TreeMap<Character, Integer>();

        for (char c : message.toCharArray()) {
            Integer i = treemap.get(c);
            if (i == null) {
                i = 0;
            }
            treemap.put(c, i + 1);
        }
        return treemap;
    }

    public static void lowerCaseLetterPrinter(int[] orderedArray) {
        for (int i = 0; i < orderedArray.length; i++) {
            for (int j = 0; j < orderedArray[i]; j++) {
                System.out.print((char)(i+97));
            }
        }
    }

    public static int[] lowerCaseLetterCounter(String message) {
        char[] messageArray = message.toCharArray();
        int[] array = new int[26];
        for (int i = 0; i < messageArray.length; i++) {
            if (messageArray[i] > 96 && messageArray[i] < 123) {
                array[(messageArray[i]) - 97]++;
            }
        }
        return array;
    }

    public static String decodeCezarCode(String message, int key) {
        return cezarCode(message, -key);
    }

    public static String decodeCezarCode(String message) {
        return cezarCode(message, -1);
    }

    public static String cezarCode(String message) {
        return cezarCode(message, 1);
    }

    public static String cezarCode(String message, int key) {
        char[] messageArray = message.toCharArray();
        for (int i = 0; i < messageArray.length; i++) {
            messageArray[i] = (char) (messageArray[i] + key);
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
