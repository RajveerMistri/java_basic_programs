
import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Loop to display cubes
        for (int i = 1; i <= num; i++) {
            System.out.println("Number is: " + i + " and cube of " + i + " is: " + (i * i * i));
        }

        sc.close();
    }
}