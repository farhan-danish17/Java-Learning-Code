/*
Confirming Perfect Numbers Through Sum Of Proper Divisors

Write a method named isPerfectNumber with one parameter of type int named number. 

If number is < 1, the method should return false.

The method must calculate if the number is perfect. If the number is perfect, the method should return true; otherwise, it should return false.
*/

package Section_6;

public class P21_Challenge23 {
    public class PerfectNumber {
    // write code here
    public static boolean isPerfectNumber (int number) {
        
        if (number < 1){
            return false;
        }
        
        int sum = 0;
        
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        return sum == number;
    }
}
}
