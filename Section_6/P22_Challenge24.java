/*
Converting Digits Into Words And Handling Edge Cases
Write a method called numberToWords with one int parameter named number.

The method should print out the passed number using words for the digits.

If the number is negative, print "Invalid Value".

The method reverse should have one int parameter and return the reversed number (int).

Use the method reverse within the method numberToWords in order to print the words in the correct order.

The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.

*/

package Section_6;

public class P22_Challenge24 {
    public class NumberToWords {
    // write code here
    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } 
        
        int reversed = reverse(number);
        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversed);
        
        while (reversed > 0) {
            int digit = reversed % 10;
            switch (digit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            reversed /= 10;
        }
        
        for (int i = 0; i < originalDigitCount - reversedDigitCount; i++) {
            System.out.println("Zero");
        }
        
        if (number == 0) {
            System.out.println("Zero");
        }
        
    }
    
    public static int reverse(int number) {
        
        int reversed = 0;
        int isNegative = number < 0 ? -1 : 1;
        number = Math.abs(number);
        
        while (number > 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number /= 10;
        }
        
        return reversed * isNegative;
        
    }
        
    public static int getDigitCount(int number) {
        
        if (number < 0) {
            return -1;
        }
        
        if (number == 0) {
            return 1;
        }
        
        int count = 0;
        
        while (number > 0) {
            count++;
            number /= 10;
        }
        
        return count;
    }
}
}
