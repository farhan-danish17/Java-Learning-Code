package Section_6;

public class P07_For_loops {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }

        /*
                MINI CHALLENGE
        Using a new for statement, call the calculateInterest method with the dollar amount of 100.
        And this time, use the interest rates between 7.5 and 10, but increment by a quarter of a percent each time, meaning 0.25 percent.
        And print the results to the console window.
         */

         for (double i = 7.5; i <= 10; i += 0.25) {
            double interestAmount = calculateInterest(100.00, i);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("$100.00 at " + i + "% interest = $" + interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}