package patterns;

public class InvertedNumberedRightPyramid {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            for (int col = 5; col > row; col--) {
                System.out.print(5 - col + 1 + " ");
            }
            System.out.println();
        }
    }
}

