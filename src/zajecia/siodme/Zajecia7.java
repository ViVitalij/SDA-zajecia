package zajecia.siodme;

import java.util.*;

/**
 * Created by m.losK on 2017-02-08.
 */
public class Zajecia7 {
    public static void main(String[] args) {
        System.out.print(isParenthesisMatchUpgrade("())(()"));
    }

    public static boolean isParenthesisMatchUpgrade(String message) {
        if (message.charAt(0) == ')') {
            return false;
        }

        Stack<Character> stack = new Stack<Character>();

        char c;
        for (int i = 0; i < message.length(); i++) {
            c = message.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.empty()) {
                    return false;
                } else if (stack.peek() == '(') {
                    stack.pop();
                } else
                    return false;
            }
        }
        return stack.empty();
    }

    //Attention: method not working f.e. for "())(()". only for learning purpose, needs improvements
    public static boolean isParenthesisMatch(String message) {
        boolean flag = true;
        if (message.charAt(0) == ')') {
            flag = false;
            return flag;
        }

        int[] codePoints = message.codePoints().toArray();
        int openingBracket = 0;
        int closingBracket = 0;

        for (int element : codePoints) {
            if (element == '(') {
                openingBracket++;
            } else if (element == ')')
                closingBracket++;
            if (closingBracket < 0) {
                flag = false;
            }
        }
        if (openingBracket != closingBracket) {
            flag = false;
        }
        System.out.println(openingBracket);
        System.out.println(closingBracket);
        return flag;
    }

    public static int sumFromStringUpgrade(String message) {
        Scanner in = new Scanner(message);
        int sum = 0;
        while (in.hasNext()) {
            try {
                sum += in.nextInt();
            } catch (Exception e) {
                in.next();
                //skip
            }
        }
        return sum;
    }

    public static int sumFromString(String message) {
        char[] charArray = message.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 48 && charArray[i] <= 57) {
                sum += (int) (charArray[i] - 48);
            }
        }
        return sum;
    }

    public static boolean isPalindrome(String message) {
        boolean flag = true;
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static StringBuilder reverseStringUpgrade(String message) {
        return new StringBuilder(message).reverse();
    }

    //better to use StringBuilder
    public static String reverseString(String message) {
        char[] messageArray = message.toCharArray();
        for (int i = 0; i < messageArray.length / 2; i++) {
            char tmp = messageArray[i];
            messageArray[i] = messageArray[messageArray.length - i - 1];
            messageArray[messageArray.length - i - 1] = tmp;
        }
        return String.valueOf(messageArray);
    }

    public static String convertSpaces(String message) {
        char[] messageArray = message.toCharArray();
        for (int i = 0; i < messageArray.length; i++) {
            if (messageArray[i] == 95) {
                messageArray[i] = (char) 32;
            }
        }
        return String.valueOf(messageArray);
    }

    public static String randomLowerCase(int size) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int generatedValue = random.nextInt(26) + 97;
            stringBuilder.append((char) generatedValue);
        }
        return stringBuilder.toString();
    }

/*  //Attention (deprecated) - ta metoda tworzy mnostwo smieci w pamieci rezerwujac dla kazdego stringa miejsce w pamieci! stringi sa immutable!!!
    //uzyj StringBuildera, patrz wyzej
    public static String randomLowerCaseFAIL(int size) {
        Random random = new Random();
        String tmpMessage = "";
        for (int i = 0; i < size; i++) {
            int generatedValue = random.nextInt(26)+97;
            String generatedValueAsString = String.valueOf((char)(generatedValue));
            tmpMessage += generatedValueAsString;
        }
        return tmpMessage;
    }

//Attention (deprecated) - ponizsza metoda tworzy mnostwo smieci w pamieci tworzac przy duzym sizie duza niepotrzebna tablice
    public static String randomLowerCase(int size){
        Random random = new Random();
        char[] charArray  = new char[size];
        for (int i = 0; i < size; i++) {
            charArray[i]= (char) (random.nextInt(26)+97);
        }
        return String.valueOf(charArray);
    }
 */

    //every next char is moving one letter further
    public static String cezarCodeExtended(String message, int key) {
        char[] messageArray = message.toCharArray();
        for (int i = 0; i < messageArray.length; i++) {
            messageArray[i] = (char) (messageArray[i] + (key + i));
        }
        return String.valueOf(messageArray);
    }

    public static String cezarCodeExtended(String message) {
        return cezarCodeExtended(message, 1);
    }

    public static char[] decodeCezarCodeExtended(String message, int key) {
        char[] messageArray = message.toCharArray();

        for (int i = 0; i < messageArray.length; i++) {
            messageArray[i] = (char) (messageArray[i] - (key + i));
        }
        return messageArray;
    }

    public static char[] decodeCezarCodeExtended(String message) {
        return decodeCezarCodeExtended(message, 1);
    }

}