import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SimpleStartupTestDrive {

    public static void main(String[] args) {

        SimpleStartup dot = new SimpleStartup();
        GameHelper helper = new GameHelper();
        int numGuesses = 0;
        int startLocation = ThreadLocalRandom.current().nextInt(0, 5);
        int[] locations = {startLocation, startLocation + 1, startLocation + 2};

        dot.setLocationCells(locations);

        int userGuess = helper.getUserInput("Guess the location of a startup! Enter an int from 0 to 6");
        String result = dot.checkYourself(userGuess);
        numGuesses++;

        while (!(result.equals("kill"))) {

            if (result.equals("miss")) {
                System.out.println("Miss! Try again");
                userGuess = helper.getUserInput("Enter an integer");
                result = dot.checkYourself(userGuess);
                numGuesses++;
            } else if (result.equals("hit")) {
                System.out.println("Hit! The startup is still alive, guess the next location!");
                userGuess = helper.getUserInput("Enter an integer");
                result = dot.checkYourself(userGuess);
                numGuesses++;
            }

        }
        System.out.println("Congratulations, you killed the startup!");
        System.out.println("It took you " + numGuesses + " guesses.");
    }
}


