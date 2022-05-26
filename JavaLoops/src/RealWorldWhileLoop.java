import java.util.Scanner;

//Real World example of While loop for validation;

public class RealWorldWhileLoop {

    public static void main (String[] args) {

        System.out.println("Enter The Password:");

        String password = "Let me in";     //This is the password
        Scanner scan = new Scanner(System.in); // use scanner to ask from user input to validate the password.
        String enter = scan.nextLine();

        while (!enter.equals(password)) {  // We need 'not equal(!)' here otherwise any input will show validation massage.
            System.out.println("Wrong Password!");
            System.out.println("Enter The Password:");
            enter = scan.nextLine();
        }
        System.out.println("Congratulation!");      // validation massage.
        System.out.println("You're Successfully Logged In.");  // validation massage.
        scan.close();
    }
}
