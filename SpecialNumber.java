import java.util.Scanner;

public class SpecialNumber {
    static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while (num > 0) {

            int digit = num % 10;

            sum = sum + factorial(digit);

            num = num / 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Special Number");
        } else {
            System.out.println(original + " is NOT a Special Number");
        }

        sc.close();
    }
}