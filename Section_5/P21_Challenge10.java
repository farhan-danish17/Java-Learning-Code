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
