public class JavaLogicalOp {
    public static void main(String[] args) {

        /*
        || = Or; Calls it "Pipe";
        && = And; Calls it "Double em percent";
        !  = Not; Call it "Not equal to";
         */

        boolean a = true;
        boolean b = true || true || false;
        boolean c = true && true;
        boolean d = true && false;
        boolean e = !true;
        boolean f = !false;
        boolean g = !((4 < 6) && true);

        /*
           || means, if any of the conditions is true, it will print "True".
           && means, need every condition to be true to print out "True", otherwise will print "False"
           ! means, not true;
         */

        // In Real World, We will use "If Statement" instead of "boolean".

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
