import java.util.Scanner;
import java.util.Random;
public class RandomNumberActivity {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random randomNumbers = new Random();

        String color, guess;
        int numCorrect = 0;

        for (int attempts = 0; attempts < 10; attempts++) {
            int correct = randomNumbers.nextInt(5);

            if (correct == 0)
                color = "red";
            else if (correct == 1)
                color = "green";
            else if (correct == 2)
                color = "blue";
            else if (correct == 3)
                color = "orange";
            else
                color = "yellow";

            System.out.print("What color has the computer chosen?");
            guess = keyboard.nextLine();
            System.out.print(">The computer chose " + color +". \n");
            if (guess.equals(color))
                numCorrect += 1;
        }
        System.out.print("You got " + numCorrect + " out of 10 correct!");
    }
}
