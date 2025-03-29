package maths;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(reverseNumber(n));
    }

    private static int reverseNumber(int n) {
        int rev = 0;

        while(n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }

        return rev;
    }
}
