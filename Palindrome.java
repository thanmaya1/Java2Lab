

class Palindrome {
    public static int findReverse(int n) {
        int reverse = 0;
        while (n > 0) {
            reverse = (reverse * 10) + (n % 10);
            n /= 10;
        }
        return reverse;
    }

    public static boolean isPalindrome(int n) {
        return n == findReverse(n);
    }

    public static void displayPalindromeNos(int n) {
        for (int i = 0; i <= n; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

