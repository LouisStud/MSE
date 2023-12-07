import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1; // Zufallszahl zwischen 1 und 100
        int attempts = 0;
        boolean hasGuessed = false;

        System.out.println("Willkommen beim Zahlenratespiel!");
        System.out.println("Ich habe eine Zahl zwischen 1 und 100 gewählt. Versuche sie zu erraten!");

        while (!hasGuessed) {
            System.out.print("Gib deine Schätzung ein: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                hasGuessed = true;
                System.out.println("Glückwunsch! Du hast die Zahl " + randomNumber + " erraten!");
                System.out.println("Du hast " + attempts + " Versuche gebraucht.");
            } else if (guess < randomNumber) {
                System.out.println("Die gesuchte Zahl ist größer als " + guess + ".");
            } else {
                System.out.println("Die gesuchte Zahl ist kleiner als " + guess + ".");
            }
        }

        scanner.close();
    }
}