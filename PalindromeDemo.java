import java.util.Scanner;

class PalindromeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Palindrome numbers up to " + n + " are: ");
        Palindrome.displayPalindromeNos(n);
    }
}
