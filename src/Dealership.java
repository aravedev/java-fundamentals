import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" * Welcome to Java Dealership *");
        System.out.println(" * Select 'a' option to buy a car * ");
        System.out.println(" * Select 'b' option to sell a car * ");
        System.out.println(" Type your option: ");

        String option = scan.next();

        switch (option){
            case "a":
                System.out.println("What is your budget?");
                int budget = scan.nextInt();
                if(budget>=10000){
                    System.out.println("Great an Audi A4x Xtream is available");

                    System.out.println("\nDo you have insurance? Write 'yes' or 'no' ");
                    scan.nextLine();
                    String insurance = scan.nextLine();

                    System.out.println("\nDo you have driver licence? Write 'yes' or 'no' ");
                    String license = scan.nextLine();

                    System.out.println("\nWhat is your credit score' ");
                    int creditScore = scan.nextInt();

                    if(insurance.equals("yes") && license.equals("yes") && creditScore>660){
                        System.out.println("Sold, pleasure doing business with you");
                    }else{
                        System.out.println("We are sorry, you arent elegible");
                    }



                }else{

                    System.out.println("Sorry, we dont sell cars under $10.000");
                }

                break;

            case "b":
                System.out.println("What is your car valued at");
                int value = scan.nextInt();
                System.out.println("What is your selling price");
                int price = scan.nextInt();

                if(value>price && price <30000){
                    System.out.println("We will buy you car. Pleasure doing business with you");
                }else{
                    System.out.println("Sorry, we arent interested");
                }
                break;

            default:
                System.out.println("Please check your answer");


        scan.close();
        }
    }
}
