package maths;

public class CountDigitsInNumber {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(n + " has " + countDigits(n) + " digits.");
    }

    private static int countDigits(int n) {
        int count = 0;

        for (int i = n; i > 0; i=i/10) {
            count = count+1;
        }

        return count;
    }
}
