package Section_5;

public class P04_if_else_Challenge {
    public static void main(String[] args) {

          boolean gameOver = true;
          int score = 800;
          int levelCompleted = 5;
          int bonus = 100;

          int finalScore = score;

          if (gameOver) {
               finalScore += (levelCompleted * bonus);
               System.out.println("Your final Score was " + finalScore);
          }

            ////----------Task ->> Replace values---------------////
        
          score = 10000; 
          levelCompleted = 8; 
          bonus = 200;

          if (gameOver) {
               finalScore += (levelCompleted * bonus);
               System.out.println("Your final Score now is " + finalScore);
          }

    }
    
}
