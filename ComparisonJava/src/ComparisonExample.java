public class ComparisonExample {

    public static void main(String[] args) {

        String a = "dog";
        if ( a == "dog") { // this is not a good practice; .equal() is best.
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
