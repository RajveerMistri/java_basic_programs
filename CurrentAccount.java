abstract class Account {
    int accNo;
    double balance;

    Account(int a, double b) {
        accNo = a;
        balance = b;
    }

    abstract void calculateInterest();
}

class SavingsAccount extends Account {
    SavingsAccount(int a, double b) {
        super(a, b);
    }

    void calculateInterest() {
        System.out.println("Interest = " + (balance * 0.05));
    }
}

class CurrentAccount extends Account {
    CurrentAccount(int a, double b) {
        super(a, b);
    }

    void calculateInterest() {
        System.out.println("Interest = " + (balance * 0.03));
    }

    public static void main(String[] args) {
        Account acc[] = {
            new SavingsAccount(101, 10000),
            new CurrentAccount(102, 20000)
        };

        for (Account a : acc)
            a.calculateInterest();
    }
}
