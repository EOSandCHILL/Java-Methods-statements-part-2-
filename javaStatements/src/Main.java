public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your new high score is " + highScore);
//      Coding challenge for Java Master class
//      Print out a 2nd score on the screen with the following:
//      score set to 10000
//      level completed set to 8
//      bonus set to 200
//      but the first print-out must remain the same
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your new high score is " + highScore);

//      Coding challenge for Java Master class
//      Print out a 3rd score on the screen with the following:
//      score set to 15000
//      level completed set to 10
//      bonus set to 300
//      but the first print-out must remain the same

//      score = 15000;
//      levelCompleted = 10;
//      bonus = 300;

        highScore = calculateScore(true, 15000, 10, 300);
        System.out.println("Your new high score is " + highScore);

//      Coding challenge for Java Master class
//      Print out a 4th score on the screen with the following:
//      score set to 20000
//      level completed set to 15
//      bonus set to 500
//      but the first print-out must remain the same

//      score = 20000;
//      levelCompleted = 15;
//      bonus = 500;

        highScore = calculateScore(true, 20000, 15, 500);
        System.out.println("Your new high score is " + highScore);

//      Coding challenge for Java Master class
//      Print out a 5th score on the screen with the following:
//      score set to 25000
//      level completed set to 20
//      bonus set to 1000
//      but the first print-out must remain the same

//      score = 25000;
//      levelCompleted = 20;
//      bonus = 1000;

        highScore = calculateScore(true, 25000, 20, 1000);
        System.out.println("Your new high score is " + highScore);
    }
    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " manged to get into position "
       + " on the high score table");
        //String name = "Jerry";
        }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

            if (gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 1000;
                return finalScore;
            }
            return -1;

//          An if statement can be followed by an optional else statement, which executes
//          when the Boolean expression is false.

//          The else if Statement. Use the else if statement to specify a new condition if
//          the first condition is false.

//          -1 is often used to indicate an error. In searching algorithms -1 indicates and invalid value
//          or a value not found.
    }
}