abstract class Employ {
    abstract void calculateSalary();
    abstract void displayDetails();
}

class FullTimeEmploy extends Employ {
    int salary = 30000;

    void calculateSalary() {}

    void displayDetails() {
        System.out.println("Full Time Salary = " + salary);
    }
}

class PartTimeEmploy extends Employ {
    int salary = 15000;

    void calculateSalary() {}

    void displayDetails() {
        System.out.println("Part Time Salary = " + salary);
    }

    public static void main(String[] args) {
        Employ e1 = new FullTimeEmploy();
        Employ e2 = new PartTimeEmploy();
        e1.displayDetails();
        e2.displayDetails();
    }
}
