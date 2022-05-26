import java.util.Scanner;

public class RealWorldTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");

        try {
            int n = scanner.nextInt();
            System.out.println(n);
        } catch (Exception e) {
            System.out.println("Sorry, please enter numbers only!");
        }
    }
}