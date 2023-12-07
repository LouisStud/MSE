package otherGames;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("Willkommen beim Zahlenratespiel!");

        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1; // Zufallszahl zwischen 1 und 100
            int attempts = 0;
            boolean hasGuessed = false;

            System.out.println("Ich habe eine Zahl zwischen 1 und 100 gewählt. Versuche sie zu erraten!");

            while (!hasGuessed) {
                System.out.print("Gib deine Schätzung ein (oder 0, um das Spiel zu beenden): ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == 0) {
                    playAgain = false;
                    break;
                } else if (guess == randomNumber) {
                    hasGuessed = true;
                    System.out.println("Glückwunsch! Du hast die Zahl " + randomNumber + " erraten!");
                    System.out.println("Du hast " + attempts + " Versuche gebraucht.");
                } else if (guess < randomNumber) {
                    System.out.println("Die gesuchte Zahl ist größer als " + guess + ".");
                } else {
                    System.out.println("Die gesuchte Zahl ist kleiner als " + guess + ".");
                }
            }
        }

        System.out.println("Vielen Dank fürs Spielen!");
        scanner.close();
    }
}
