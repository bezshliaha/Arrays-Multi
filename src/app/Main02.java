package app;

import java.util.Random;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        int[][] lotteryTicket = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        Random random = new Random();
        int randomRow = random.nextInt(lotteryTicket.length);
        int randomColumn = random.nextInt(lotteryTicket[0].length);

        int secretNumber = lotteryTicket[randomRow][randomColumn];

        System.out.println("Random Row: " + (randomRow + 1) +
                           "\nRandom Column: " + (randomColumn + 1) +
                           "\nSecret Number: " + secretNumber);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the winning number (up to two characters): ");

        try {
            int scannerInputNumber = Integer.parseInt(sc.nextLine());

            if (secretNumber == scannerInputNumber) {
                System.out.println("Congratulations! It's the winning number!");
            } else {
                System.out.println("Sorry, it's not the winning number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Non-numeric value entered.");
        }
    }
}