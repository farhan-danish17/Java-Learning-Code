/*
In this challenge, we'll be using the NATO alphabet to replace a character or letter, with NATO's standardized word for that letter.
In radio transmissions, the word car, "C", "A", "R", would be read, "Charlie Able Roger", for clarity.
We'll take a single character, and return the matching word from the NATO phonetic alphabet, shown on this slide.
We'll just do this for the letters A, through E.

To do this:
Create a new char variable.
Use the traditional switch statement (with a colon in case labels) that tests the value in the variable from Step 1. 
Create cases for the characters,  A, B, C, D, and E.

Display a message in each case block, with the letter and the NATO word, then break.
Add a default block, which displays the letter with a message saying not found.
*/

package Section_6;

public class P03_SwitchPractice {
    public static void main(String[] args) {
        
        char charValue = 'X';
        switch (charValue) {
          
            case 'A':
               System.out.println("A is able");
               break;
            case 'B':
               System.out.println("B is baker");
               break;
            case 'C':
               System.out.println("C is charlie");
               break;
            case 'D':
               System.out.println("D is dog");
               break;
            case 'E':
               System.out.println("E is easy");
               break;
            default:
               System.out.println("Letter " + charValue + " was not found in the switch");
               break;
        }
}
}
