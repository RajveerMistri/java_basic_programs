import java.util.Scanner;

class Student {
    String name;
    int roll;
    float marks;

    Student(String n, int r, float m) {
        name = n;
        roll = r;
        marks = m;
    }

    void display() {
        System.out.println("\n Student Details are as follows : ");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String n = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();

        System.out.print("Enter Marks: ");
        float m = sc.nextFloat();

        Student s = new Student(n, r, m);
        s.display();
    }
}
