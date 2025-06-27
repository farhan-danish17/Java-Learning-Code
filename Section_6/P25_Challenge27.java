/*
Constructing A Diagonal Star Pattern With Loops
Write a method named printSquareStar with one parameter of type int named number. 

If number is < 5, the method should print "Invalid Value".

The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops 
*/

package Section_6;

public class P25_Challenge27 {
    public class DiagonalStar {
    // write code here
    public static void printSquareStar (int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
        
        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (
                    row == 1 ||
                    row == number ||
                    col == 1 ||
                    col == number ||
                    row == col ||
                    col == (number - row + 1)
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }
    }
}
}
