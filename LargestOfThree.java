import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double largest = (a > b && a > c) ? a : (b > c ? b : c);
        System.out.println("The largest number is: " + largest);

        sc.close();
    }
}
