public class JavaConditionalOp {
    public static void main(String[] args) {
        int a = (7 > 8) ? 7 : 3; // We can change the (condition > condition) to see  printing result.
        /*
         Read as,
         If a = 7 is greater than 3;
         Then, for true, it will print 7;
         Or, for false, it will print 3.
         */

        /*
         This is basically an alternative of "If Statement";

         if(7>3) {
         a =7;
         } else {
         a = 3;
         }
         */

        System.out.println(a);
    }
}
