package Section_5;

public class P02_Statements_Whitespace {
    public static void main(String[] args) {
        
        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println(myVariable);

        System.out.println("This is a test");

        System.out.println("This is" +
            " another" +
            " still more.");

        myVariable--;
        System.out.println("myVariable = " + myVariable);

        if (myVariable == 0) {
            System.out.println("It's now zero");
        }
        
    }
}
