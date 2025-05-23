package Section_4;

public class Program5 {
    public static void main(String[] args) {
        int topscore = 80;
        if (topscore < 100) {
            System.out.println("You got the high score!");
        }

        int SecondTopScore = 81;
        if (topscore > SecondTopScore && topscore < 100) {
            System.out.println("Greater than 2nd top score and less than 100");
        }

        if((topscore > 90) || (SecondTopScore <= 90)) {
            System.out.println("Either or both of the condition is true");
        }

        boolean isCar = false;
        if (!isCar){
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Tata" ;
        boolean isDomestic = makeOfCar == "Tata" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String S = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        
        System.out.println(S);
    }
}
