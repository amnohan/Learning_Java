// An interface is basically an outline for class.

interface waterBottle {
    String color = "Green";
    void fillUp();
}
public class InterfaceInJava implements waterBottle {

    public static void main(String[] args) {
        System.out.println("Water bottle color is: " + color);
        InterfaceInJava example = new InterfaceInJava();
        example.fillUp();
    }

    @Override
    public void fillUp() {
        System.out.println("It is filled up with water.");
    }
}
