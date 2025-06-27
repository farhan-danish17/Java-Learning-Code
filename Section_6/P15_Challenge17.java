/*
Summing The First And Last Digits Of An Integer
Write a method named sumFirstAndLastDigit with one parameter of type int called number. 

The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.

If the number is negative then the method needs to return -1 to indicate an invalid value.
*/


package Section_6;

public class P15_Challenge17 {
    public class FirstLastDigitSum {
    // write code here
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }
        
        int lastDigit = number % 10;
          int firstDigit = number;
          while (firstDigit >= 10) {
               firstDigit /= 10;
          }
          return firstDigit + lastDigit;
    }
}
}
