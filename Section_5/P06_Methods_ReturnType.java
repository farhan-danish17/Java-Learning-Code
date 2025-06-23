package Section_5;

public class P06_Methods_ReturnType {

     public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

          int finalScore = score; 
          if (gameOver) {
               finalScore += (levelCompleted * bonus);
               return finalScore; 
          }
          return -1; // if the game is not over then default return value 
     }
     public static void main(String[] args) {
          
          boolean gameOver = true;
          int score = 800;
          int levelCompleted = 5;
          int bonus = 100;
          
          System.out.println("The score is " + calculateScore(gameOver, score, levelCompleted, bonus));
     }
}