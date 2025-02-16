package patterns;

import java.util.Scanner;

public class HalfDiamondStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numberEnteredByUser = scanner.nextInt();
        functionToBeCalled(numberEnteredByUser);
    }

    private static void functionToBeCalled(int numberOfRowsByUser) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        for (int row = 1; row <= 5; row++) {
            for (int col = 5; col >= row; col--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
