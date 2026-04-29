import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Units Consumed: ");
        double units = sc.nextDouble();

        double chargePerUnit = 0, amount, surcharge = 0;

        if (units < 200)
            chargePerUnit = 1.20;
        else if (units < 400)
            chargePerUnit = 1.50;
        else if (units < 600)
            chargePerUnit = 1.80;
        else
            chargePerUnit = 2.00;

        amount = units * chargePerUnit;

        if (amount > 400)
            surcharge = amount * 0.15;

        double total = amount + surcharge;
        if (total < 100)
            total = 100;

        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Customer ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Units Consumed: " + units);
        System.out.println("Amount Charges @Rs." + chargePerUnit + " per unit: " + amount);
        System.out.println("Surcharge: " + surcharge);
        System.out.println("Total Amount to Pay: Rs." + total);

        sc.close();
    }
}
