public class AnotherExampleRecursion {
    public static void main(String[] args) {
        saySomething(5);
    }
    public static void saySomething(int n) {
        if (n == 0) {
            System.out.println("Done!");
        } else {
            System.out.println("Hello, Nohan!");
            n--;
            saySomething(n);
        }
    }
}
