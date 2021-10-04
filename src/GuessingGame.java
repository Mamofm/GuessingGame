/*
 Create a number-guessing game using a while loop. The loop will allow users
 to guess until the secret number is guessed. User get 10 chances to guess the number.
 */
import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            Random randomGenerator = new Random();
            int idx=1, guessedNum=0, secretNum;

            // generate secret number randomly
            secretNum = randomGenerator.nextInt(10);
            System.out.println("I am thinking about a number between 1 and 10...");
            System.out.println("Can you guess it? ");
            System.out.println("Secrete Number " + secretNum);
            while ( idx <= 10){
                guessedNum  = keyboard.nextInt();
                if (guessedNum == secretNum) {
                    System.out.println("That's right! You are a good guesser.");
                    break;
                } else if ((guessedNum < secretNum))
                    System.out.println("It's too low. Guess again.");
                else if ((guessedNum > secretNum))
                    System.out.println("It's too high. Guess again.");
                idx++;
            }
            }
}
