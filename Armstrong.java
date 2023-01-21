import java.util.Scanner;
class Armstrong {
    public static boolean isArmstrong(int n) {
        int num = n;
        int sum = 0;
        int digits = (int) Math.log10(n) + 1;
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return num == sum;
    }

    public static void displayArmstrong(int n) {
        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Armstrong numbers up to " + n + " are: ");
        displayArmstrong(n);
    }
}
