public class JavaExponent {

    public static void main(String[] args) {

        System.out.println(Math.pow(2,3));           // Can do directly too.

        double exponent0 = Math.pow(2,3);           // normally do this way.
        System.out.println(exponent0);

        int exponent = (int) Math.pow(2,3);         // this is (int) casting.
        System.out.println(exponent);
    }
}
