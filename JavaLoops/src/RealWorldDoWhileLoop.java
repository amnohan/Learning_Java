import java.util.Scanner;

public class RealWorldDoWhileLoop {

    public static void main (String[] args) {

        String password = "Let me in";
        Scanner scan = new Scanner(System.in);
        String enter;
        do {
            System.out.println("Enter The Password:");
            enter = scan.nextLine();
        } while(!enter.equals(password));
        System.out.println("Congratulation!");
        System.out.println("You're Successfully Logged In.");
        scan.close();
    }
}
