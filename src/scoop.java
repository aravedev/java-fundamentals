public class scoop {
    // This variable is in all the scope
    static int dog = 5;

    public static void main(String[] args) {

        // inside main function, only can be displayed variables that have been assigned here and these
        // cant be invoke in a different function.
        int apples = 3;
        printStr();
        System.out.println("apples : " + apples);

    }

    public static void printStr(){
        int banana = 2;
        System.out.println("bananas : " + banana);
        System.out.println("dog : " + dog);
    }
}
