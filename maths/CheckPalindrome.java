package maths;

public class CheckPalindrome {
    public static void main(String[] args) {
        int number = 4554;

        if (checkingPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    private static boolean checkingPalindrome(int n) {
        int revNum = 0;
        int dup = n;

        while (n > 0) {
            int ld = n % 10;
            revNum = (revNum * 10) + ld;
            n = n / 10;
        }

        return dup == revNum;
    }
}


