import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (less than 10 billion): ");
        long num = sc.nextLong();

        if (num <= 0 || num >= 10000000000L) {
            System.out.println("Number out of range!");
        } else {
            int count = 0;
            long temp = num;
            while (temp > 0) {
                temp /= 10;
                count++;
            }
            System.out.println("Number of digits in " + num + " = " + count);
        }

        sc.close();
    }
}
