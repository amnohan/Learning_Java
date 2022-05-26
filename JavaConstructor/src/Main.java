public class Main {
    public static void main(String[] args) {

        Tshirt t = new Tshirt("Red", 'L');

        System.out.println("How to choose your perfect T-shirt: ");
        System.out.println("Choose your color first: " + Tshirt.color);
        System.out.println("Select your size: " + Tshirt.size);
        Tshirt.putOn();
        Tshirt.takeOff();
    }
}
