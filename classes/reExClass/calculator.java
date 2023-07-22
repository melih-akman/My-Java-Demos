package classes.reExClass;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        fourTransactions transactions = new fourTransactions();
        int prompt = 0;
        int a, b;
        System.out.println("Welcome to the calculator!");
        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.println("Please enter transaction number:");
            prompt = scan.nextInt();
            if (prompt == 0) {
                System.out.println("Thank you for using the calculator!");
                break;
            }
            System.out.println("Please enter first number:");
            a = scan.nextInt();
            System.out.println("Please enter second number:");
            b = scan.nextInt();
            switch (prompt) {
                case 1:
                    System.out.println("Result: " + transactions.add(a, b));
                    break;
                case 2:
                    System.out.println("Result: " + transactions.subtract(a, b));
                    break;
                case 3:
                    System.out.println("Result: " + transactions.multiple(a, b));
                    break;
                case 4:
                    System.out.println("Result: " + transactions.divide(a, b));
                    break;
                default:
                    System.out.println("Invalid transaction number!");
                    break;
            }
        } while (prompt != 0);
        scan.close();
    }

}
