package Section_5;

public class P01_expressions_keywords {
    public static void main(String[] args) {

        double kilometers = (100 * 1.609344);

        System.out.println(kilometers);

        int highScore = 50;

        if (highScore > 25) {
            highScore = 1000 + highScore; //add bonus points
        }

        System.out.println(highScore);

        int health = 100;

        if ((health < 25) && (highScore > 1000)) {
            highScore -= 1000;
        }

        System.out.println(highScore);

    }
}
