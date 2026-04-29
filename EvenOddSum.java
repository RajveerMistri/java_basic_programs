import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sumEven = 0, sumOdd = 0;

        System.out.println("Even numbers:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sumEven += i;
            }
        }

        System.out.println("\nOdd numbers:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sumOdd += i;
            }
        }

        System.out.println("\nSum of even numbers = " + sumEven);
        System.out.println("Sum of odd numbers = " + sumOdd);

        sc.close();
    }
}
