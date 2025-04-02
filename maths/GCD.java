package maths;

public class GCD {

    public static void main(String[] args) {
        int a = 10, b = 15;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }

    private static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (a == 0) {
            return b;
        }

        return a;
    }
}
