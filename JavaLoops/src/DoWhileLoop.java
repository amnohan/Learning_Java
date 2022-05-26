public class DoWhileLoop {
    public static void main(String[] args) {

    //This is regular 'do while loop'

        int a = 0;
        // if a = more than 10, then only the value of 'int a' will be printed and 'while' condition will be ignored.

        do {
            System.out.println(a);
            a++;
        } while(a <= 10); //Don't forget this semicolon.
    }
}
