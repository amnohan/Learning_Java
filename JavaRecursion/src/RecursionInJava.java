public class RecursionInJava {
    public static void main(String[] args) {
        countBack(6);
    }
    public static void countBack(int n) {
        if (n == 0) {
            System.out.println("Done!");
        } else {
            System.out.println(n);
            n--;
            countBack(n);
        }
    }
}
