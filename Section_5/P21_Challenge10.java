/*
Implementing A Minutes-To-Years-And-Days Calculator For Advanced Time Conversions
Write a method printYearsAndDays with parameter of type long named minutes.

The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.

If the parameter is less than 0, print text "Invalid Value".

Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.
*/

package Section_5;

public class P21_Challenge10 {
    public class MinutesToYearsDaysCalculator {
    // write code here
    public static void printYearsAndDays (long minutes) {
        
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
        
        long years = minutes / (60 * 24 * 365); 
        long days = ((minutes - (years * 60 * 24 * 365)) / (60 * 24)); 

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
}
