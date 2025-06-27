/*
Deriving The Greatest Common Divisor (GCD) Efficiently
Write a method named getGreatestCommonDivisor with two parameters of type int named first and second. 

If one of the parameters is < 10, the method should return -1 to indicate an invalid value.

The method should return the greatest common divisor of the two numbers (int).
*/

package Section_6;

public class P20_Challenge22 {
    public class GreatestCommonDivisor {
    // write code here
    public static int getGreatestCommonDivisor (int first, int second) {
        
        if (first < 10 || second < 10) {
            return -1;
        }
        
        int gcd = 1;
        int min = Math.min(first, second);
        
        for (int i = 1; i <= min; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }
        
        return gcd;
    }
}
}
