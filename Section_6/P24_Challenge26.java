/*
Identifying The Largest Prime Factor Of A Number
Write a method named getLargestPrime with one parameter of type int named number. 

If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.



The method should calculate the largest prime factor of a given number and return it.
*/

package Section_6;

public class P24_Challenge26 {
    public class LargestPrime {
    // write code here
    public static int getLargestPrime(int number) {
        
        if (number <= 1) {
            return -1;
        }
        
        int largestPrime = -1;
        
        while (number % 2 == 0) {
            largestPrime = 2;
            number /= 2;
        }
        
        for (int i = 3; i <= number; i += 2) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }
        
        return largestPrime;
     }
}
}
