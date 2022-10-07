import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating scanner object
        Scanner scan = new Scanner(System.in);

        // Variables
        String item;
        double price;
        double tax;
        double total;

        //
        System.out.println("Welcome to dealer shop - Las Vegas");
        System.out.println("Please register the item that you have purchased");
        System.out.print("Item: ");
        item = scan.next();

       System.out.print("Item Price: ");
       price = scan.nextDouble();

        System.out.print("Tax amount: ");
        tax = scan.nextDouble();

        // Math
        tax = tax / 100;
        total = price * tax + price;

        // Result
        System.out.println("Thank you for your purchased");
        System.out.println("The value of your payment is: " + "$ " + total);
        System.out.println("Have a nice day");

    scan.close();

    }
}