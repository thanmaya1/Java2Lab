// package p2

class Utility {
    public long findReverse(long n) {
        long reverse = 0;
        while (n != 0) {
            reverse = (reverse * 10) + (n % 10);
            n /= 10;
        }
        return reverse;
    }
}

class Checker {
    public boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = (int) Math.log10(n) + 1;
        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return original == sum;
    }

    public boolean isPalindrome(long n) {
        long original = n;
        long reverse = 0;
        while (n != 0) {
            reverse = (reverse * 10) + (n % 10);
            n /= 10;
        }
        return original == reverse;
    }
}

class DisplayAll {
    public void displayPalindromeNos(long n) {
        for (long i = 1; i <= n; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void displayArmstrong(int n) {
        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

// package p1

class Demo {
    public static void main(String[] args) {
        Utility util = new Utility();
        Checker check = new Checker();
        DisplayAll display = new DisplayAll();

        long num = 12345;
        System.out.println("Reverse of " + num + ": " + util.findReverse(num));

        int number = 153;
        System.out.println(number + " isArmstrong: " + check.isArmstrong(number));
        System.out.println(num + " isPalindrome: " + check.isPalindrome(num));

        System.out.print("Palindrome numbers less than or equal to " + num + ": ");
        display.displayPalindromeNos(num);
        System.out.print("Armstrong numbers less than or equal to " + number + ": ");
        display.displayArmstrong(number);
    }
}
