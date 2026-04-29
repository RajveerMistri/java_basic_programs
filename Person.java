import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }
}

class Employee extends Person {
    double salary;
    String designation;

    Employee(String n, int a, double s, String d) {
        super(n, a);
        salary = s;
        designation = d;
    }

    void display() {
        System.out.println("\n Employee Details are :");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String n = sc.nextLine();

        System.out.print("Enter Age: ");
        int a = sc.nextInt();

        System.out.print("Enter Salary: ");
        double s = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Designation: ");
        String d = sc.nextLine();

        Employee e = new Employee(n, a, s, d);
        e.display();
    }
}
