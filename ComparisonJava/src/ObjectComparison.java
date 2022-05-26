public class ObjectComparison {

    public static void main(String[] args) {

        String a = new String("Nohan");
        String b = new String("Nohan");
        /*
        if (a == b) {   // if a == a; then it will print "True".
            System.out.println("True");
        }else {
            System.out.println("False");
        }
         */
        if (a.equals("Nohan")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

// This is "False" cuz we compare value vs. object!
// So we have to use object method to compare!