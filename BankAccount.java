import java.util.Scanner;

class BankAccount {
    int accNo;
    String name;
    double balance;

    BankAccount(int a, String n, double b) {
        accNo = a;
        name = n;
        balance = b;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        balance -= amt;
    }

    void display() {
        System.out.println("Final Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int a = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String n = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double b = sc.nextDouble();

        BankAccount obj = new BankAccount(a, n, b);

        System.out.print("Enter Deposit Amount: ");
        double d = sc.nextDouble();

        System.out.print("Enter Withdraw Amount: ");
        double w = sc.nextDouble();

        obj.deposit(d);
        obj.withdraw(w);

        obj.display();
    }
}
