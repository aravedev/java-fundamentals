import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("** Java Calculator for shapes **");

        System.out.println("1 - Area circle");
        System.out.println("2 - Area triangle");
        System.out.println("3 - Area rectangle");
        System.out.println("4 - Perimeter rectangle");
        System.out.println("0 - Exit program");
        System.out.println("Please select one of the next options: ");

        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        switch (option){
            case 1: areaCircle();break;

            case 2: areaTriangle();break;

            case 3: areaRectangle();break;

            case 4: perimeterRectangle();break;

            default: System.out.println("Sayonara . . .");
        }

    }

    public static void areaCircle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Circle Radius: ");
        double r = scan.nextDouble();
        double area = Math.pow(r,2) * Math.PI;
        System.out.println("Circle Area is: " + area);
    }

    public static void areaTriangle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Triangle Base: ");
        double base = scan.nextDouble();

        System.out.println("Triangle height: ");
        double height = scan.nextDouble();

        double area =( base * height )/2;

        System.out.println("Triangle Area is: " + area);
    }

    public static void areaRectangle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Rectangle base: ");
        double base = scan.nextDouble();

        System.out.println("Rectangle height: ");
        double height = scan.nextDouble();

        double area  = base * height;
        System.out.println("Rectangle Area is: " + area);
    }

    public static void perimeterRectangle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Rectangle base: ");
        double base = scan.nextDouble();

        System.out.println("Rectangle height: ");
        double height = scan.nextDouble();

        double perimeter  = 2*base + 2*height;
        System.out.println("Rectangle perimeter is: " + perimeter);
    }


}
