import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        int marks[] = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double percentage = total / 5.0;
        String result;
        if (percentage >= 60)
            result = "1st Division";
        else if (percentage >= 45)
            result = "2nd Division";
        else if (percentage >= 33)
            result = "3rd Division";
        else
            result = "Fail";

        System.out.println("\n--- Student Result ---");
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);

        sc.close();
    }
}
