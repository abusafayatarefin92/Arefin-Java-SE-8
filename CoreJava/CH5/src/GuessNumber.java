
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        int number = (int) (Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a maggic number between 0 to 100");

        int guess = -1;
        int attempt = 0;

        while (guess != number) {
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();

            if (guess == number) {
                System.out.println("Yes, the number is " + number);
            } else if (guess > number) {
                System.out.println("Your guess too high");
            } else {
                System.out.println("Your guess too low");
            }
            attempt++;
            System.out.println("Your attepmt is: " + attempt);
        }
    }

}
