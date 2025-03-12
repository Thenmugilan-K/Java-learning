package Type_conversion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Currency currency = new Currency();
        Scanner sc = new Scanner(System.in);
        System.out.println("Currency Conversion");

        while (true){
            System.out.println("Choose the currency to convert from: ");
            System.out.println("1. Rupee");
            System.out.println("2. Dollar");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            if (choice == 3) {
                System.out.println("Exiting program.");
                break;
            }

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            switch (choice){
                case 1:
                    System.out.println("1 Rupee = " + currency.Rupee(amount) + " Dollars");
                    System.out.println("1 Rupee = " + currency.RupeeToEuro(amount) + " Euros");
                    break;
                case 2:
                    System.out.println("1 Dollar = " + currency.DollarToRupee(amount) + " Rupees");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
}
