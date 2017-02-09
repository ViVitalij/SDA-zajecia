package zajecia.osme;

import zajecia.siodme.Zajecia7;

import java.math.BigInteger;

/**
 * Created by m.losK on 2017-02-09.
 */
public class Zajecia8 {
    public static void main(String[] args) {
        System.out.println(split1("Ala ma kota"));
    }

    public static String[] split1(String message){
        return message.split(" ");
    }

    public static boolean startsWith1(String message, String expression){
        return message.startsWith(expression);
    }

    /**
     *  Can throw exception if expression.length()>message.length()
     */
    //use method startsWith1
    public static boolean startsWith2(String message, String expression){
      return message.substring(0, expression.length()).equals(expression);
    }

    /**
     *  Can throw exception if expression.length()>message.length()
     */
    //use method startsWith1
    public static boolean startsWith3(String message, String expression){
        boolean flag = true;
        char[] charsArrayMessage = message.toCharArray();
        char[] charsArrayExpression = expression.toCharArray();
        for (int i = 0; i < expression.length() ; i++) {
            if(charsArrayMessage[i]!=charsArrayExpression[i]){
                flag = false;
            }
        }
        return flag;
    }

    public static int sumOfNumberDigitWithString(int number){
        String numberAsString = String.valueOf(number);
        return Zajecia7.sumFromString(numberAsString);
    }

    public static int sumOfNumberDigits(int number){
        int sum = 0;
        if(number<0){
            number=-number;
        }
        while(number!=0){
            sum+=(number%10);
            number/=10;
        }
        return sum;
    }

    public static String switchCaseToLowerCaseUpgrade(String message){
        return  message.toLowerCase();
    }

    public static String switchCaseToUpperCaseUpgrade(String message){
        return  message.toUpperCase();
    }

    public static String switchCaseUseASCII(String message){
        char[] charsArray = message.toCharArray();
        for (int i = 0; i < charsArray.length; i++) {
            if(charsArray[i]>64 && charsArray[i]<91){
                charsArray[i]+=32;
            }
            else if(charsArray[i]>98 && charsArray[i]<123){
                charsArray[i]-=32;
            }
        }
        return String.valueOf(charsArray);
    }

    public static String switchCaseWithBiulderUseASCII(String message){
      StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char tmp = message.charAt(i);
            if(tmp>64 && tmp <91){
                stringBuilder.append((char)(tmp+32));
            } else if(tmp>96 && tmp <123){
                stringBuilder.append((char)(tmp-32));
            } else{
                stringBuilder.append(tmp);
            }
        }
        return stringBuilder.toString();
    }

    public static int fibonacciRecursion(int index) {
        if (index < 0) {
            return -1;
        } else if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        }
        return fibonacciRecursion(index - 2) + fibonacciRecursion(index - 1);
    }

    public static int fibonacci(int index) {
        int prev = 0;
        int next = 1;
        int result = 0;
        for (int i = 1; i < index; i++) {
            result = prev + next;
            prev = next;
            next = result;
        }
        if (index == 1) {
            result = 1;
        }
        return result;
    }

    public static BigInteger factorialUpgrade(int number) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        if (number == 0)
            return bigInteger.valueOf(1);
        else
            return bigInteger.multiply(factorialUpgrade(number - 1));
    }
}
