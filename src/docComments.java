public class docComments {
    public static void main(String[] args) {

       double result= calculateArea(5,4,"area");
        double result2= calculateArea(5,4,"perimeter");
        System.out.println(result);
        System.out.println(result2);
    }
    /*
    * Function name: greet
    *
    * Inside the function:
    * 1. prints: "Hi Danny"
    *
    * */
    public static void greet(){
        System.out.println("Hi Danny");

    }

    /*
    * Function name: printText
    * @param name(String)
    * @param age(String)
    *
    * Inside the function:
    * 1. Print name and age as part of a text
    * */

    public static void printText(String name, String age){
        System.out.println("Hi, I'm " + name +" and I'm "+ age + " years old");
    }

    /**
     * Function calculateArea:
     * @param length (double)
     * @param width (double)
     *
     * Inside the function:
     * 1. Calculates the area and returns it
     *
     * */
    public static double calculateArea(double length, double width, String option){
        switch (option){
            case "area": return length * width;
            case "perimeter": return 2*(length + width);
            default:return 414;
        }


    }
}
