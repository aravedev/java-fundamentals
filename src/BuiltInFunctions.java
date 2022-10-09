public class BuiltInFunctions {
    public static void main(String[] args) {
        // Build a function is a function that java already did for us, for example println()
        System.out.println("Hello Danny");
        double result = Math.log(109.46);
        System.out.println(result);

        double power = Math.pow(2,4);
        System.out.println(power);

        double random = Math.random()*100;
        random=Math.round(random);
        System.out.println(random);
    }
}
