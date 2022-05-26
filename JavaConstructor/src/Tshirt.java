public class Tshirt {

    public static String color;
    public static char size;

    Tshirt(String newColor, char newSize) {
        color = newColor;
        size = newSize;
    }
    public static void putOn() {
        System.out.println("Put on the shirt now and check the fittings!");
    }
    public static void takeOff() {
        System.out.println("Take off your T-shirt and pay before you leave.");
    }
}
