/*
Write a program where the program chooses a number between 1 and 100.
The player is then asked to enter a guess.
If the player guesses wrong, then the program gives feedback and ask to enter an other guess
until the guess is correct.

Make the range customizable (ask for it before starting the guessing).
You can add lives. (optional)
 */

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

    private static boolean notDead = true;
    private static boolean hasNotWon = true;
    private static int lives = 1;
    private static int range = 2;
    private static int myRandomNumber = 2;

    public static void main(String[] args) {

        generateGame();
        playGame();

    }
    private static void generateGame() {
        System.out.println("Let's play! Give me a number between 2 and 100!");
        Scanner scanner = new Scanner(System.in);
        range = scanner.nextInt();

        while (range < 2 || range > 100) {
            System.out.print("Enter a number between 2 and 100!");
            range = scanner.nextInt();
        }

        //set lives
        lives += range / 5;

        System.out.println("You have " + lives + " lives!");

        //set random number
        Random r = new Random();
        int myRandomNumber = 0;
        myRandomNumber = r.nextInt(range + 1);
    }

    private static void playGame() {

        while (notDead && hasNotWon) {
            System.out.println("Okay, let's play! What number between 0 and " + range + " am I thinking of?");

            //guess number

            Scanner scanner2 = new Scanner(System.in);
            int guess = scanner2.nextInt();

            if (guess == myRandomNumber) {
                System.out.println("YES! " + myRandomNumber + " was exactly the number I was thinking of!");
                win();
            } else {
                if (guess < myRandomNumber) {
                    System.out.println("Bad luck! The number I'm thinking of is a bit higher!");
                    lives -= 1;
                    LivesLeft();
                    if (lives == 0) {
                        die();
                    }

                } else {
                    System.out.println("Bad luck! The number I'm thinking of is a bit lower!");
                    lives -= 1;
                    LivesLeft();
                    if (lives == 0) {
                        die();
                    }
                }
            }
        }
    }

        public static void die(){
            notDead = false;
            System.out.println("GAME OVER");
    }
        public static void win(){
            hasNotWon = false;
            System.out.println("YOU WIN");
         }
        public static void LivesLeft(){
            System.out.println("You have " + lives + " lives left.");
        }
    }
