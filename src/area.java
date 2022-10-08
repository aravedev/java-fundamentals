public class area {
    public static void main(String[] args) {
       // measureRectangle(5,4);
        bill(32.5);
    }

    public static void measureRectangle(double length, double width){
        double area = length * width;
        System.out.println(area);
    }

    public static void bill (double check){
        double tax = check * 0.15;
        double total = tax + check;
        System.out.println("bill :      " + check);
        System.out.println("tax 15%:     " + tax);
        System.out.println("Your bill is: " + total);
    }
}
