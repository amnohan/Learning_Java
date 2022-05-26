public class JavaFinallyKeyword {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            int c = a / 0;    // Cuz, no number can't divide by 0;
        } catch (Exception e) {
            System.out.println(e); // If we put any other digit than 0, then this block of Exception codes won't print.
        } finally {
            System.out.println("This is the 'finally' keyword in Java and it always gets run!");
        }
    }
}
   // No matter what the 'finally' blocks of codes will always print in any circumstances.