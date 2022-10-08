public class ReturnValues {
    public static void main(String[] args) {

        double result = area(5,3);
        System.out.println(result);

    }

    public static double area (double length, double width){

        double area = length * width;
        return area;

    }
}
