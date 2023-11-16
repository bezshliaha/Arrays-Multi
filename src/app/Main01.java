package app;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        int[][] lotteryTicket = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the winning number (up to two characters): ");

        String input = sc.nextLine();

        try {
            int winningNumber = Integer.parseInt(input);
            // тут можно поменять, в зависимости от количества символов в числе
            if (input.length() > 2) {
                System.out.println("Error: Exceeded character limit.");
            } else {
                if (isWinningNumber(lotteryTicket, winningNumber)) {
                    System.out.println("Congratulations! It's the winning number!");
                } else {
                    System.out.println("Sorry, it's not the winning number.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Non-numeric value entered.");
        }
    }
    private static boolean isWinningNumber(int[][] lotteryTicket, int winningNumber) {
        for (int i = 0; i < lotteryTicket.length; i++) {
            for (int j = 0; j < lotteryTicket[i].length; j++) {
                if (lotteryTicket[i][j] == winningNumber) {
                    return true;
                }
            }
        }
        return false;
    }
}
