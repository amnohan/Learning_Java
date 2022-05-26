import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Your Number Here: ");
        int number = userInput.nextInt();      // if it is String, we could put .nextLine() instead of .nextInt();
        System.out.println(number);

        if (number >= 90 && number <= 100) {
            System.out.println("Congratulation You've Passed And Your Grade is: 'A'");
        }
        else if (number >= 80 && number <= 89) {
            System.out.println("Congratulation You've Passed And Your Grade is: 'B'");
        }
        else if (number >= 70 && number <= 79) {
            System.out.println("Congratulation You've Passed And Your Grade is: 'C'");
        }
        else if (number >=65 && number <=69) {
            System.out.println("Congratulation You've Passed And Your Grade is: 'D'");
        }
        else {
            System.out.println("Sorry You're Failed And Your Grade is: 'F'");
        }
    }
}