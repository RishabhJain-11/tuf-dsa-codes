package patterns;

import java.util.Scanner;

public class InvertedStarPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numberEnteredByUser = scanner.nextInt();
        functionToBeCalled(numberEnteredByUser);
    }

    private static void functionToBeCalled(int numberOfRowsByUser) {
        for (int row = 0; row < numberOfRowsByUser; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }

            for (int col = 0; col < 2 * (numberOfRowsByUser - row) - 1; col++) {
                System.out.print("*");
            }

            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
