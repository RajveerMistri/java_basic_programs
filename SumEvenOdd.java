import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sumEven = 0, sumOdd = 0;

        // Loop to calculate sums
        for (int i = 1; i <= n; i++) {
            sumEven += 2 * i;       // Even numbers: 2, 4, 6, ...
            sumOdd += (2 * i - 1);  // Odd numbers: 1, 3, 5, ...
        }

        // Display results
        System.out.println("Sum of first " + n + " even natural numbers = " + sumEven);
        System.out.println("Sum of first " + n + " odd natural numbers  = " + sumOdd);

        sc.close();
    }
}
