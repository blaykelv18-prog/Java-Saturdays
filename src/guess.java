import java.util.Random;
import java.util.Scanner;

    public static void main(
            String[] args) {
        System.out.print("Guessing game starting!");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secret = random.nextInt(100) +1;
        int guesses= 0;
        int guess =0;

        System.out.println(" I'm thinking of a number between 1 and 100!");

        while (guess != secret) {
            System.out.print("Your guess: ");
            guess = scanner.nextInt();
            guesses++;

            if (guess < secret) {
                System.out.println("Too low!");
            } else if (guess > secret) {
                System.out.println("Too high!");
            }else {
                System.out.println("You got it in" + " " + guesses +" guesses");
            }
        }
        scanner.close();
    }
