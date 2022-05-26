import java.util.Scanner;

public class ModulusInRealWorld {
    public static void main(String[] args) {
        int temp;
        boolean isPrime = true;

        Scanner scan = new Scanner(System.in);  // to get data from user;
        System.out.println("Enter any number:");
        int num = scan.nextInt(); //input int number will print in next line;
        scan.close();    //to save data

        for (int i = 2; i < num / 2; i++) {   //for loop, using i < num/2 so that user can put any number;
            temp = num % i;  // using modulus to find out prime or not;
            if (temp == 0) {     // if statement
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Congratulation! " +num + " is a Prime Number.");
        } else {
            System.out.println("Sorry, " + num + " is not a Prime Number.");
        }
    }
}