
    //ENUM inside the class with IF statement;

public class AnotherEnum {
    enum Flavor {
        CHOCOLATE, VANILLA, STRAWBERRY, CHEESECAKE,
    }
    public static void main(String[] args) {

        Flavor f = Flavor.STRAWBERRY;

        if (f == Flavor.CHOCOLATE) {
            System.out.println( "I love chocolate flavor ice-cream.");
        } else if (f == Flavor.VANILLA) {
            System.out.println("I love vanilla flavor ice-cream.");
        } else if (f == Flavor.STRAWBERRY) {
            System.out.println("I love strawberry flavor ice-cream.");
        } else if (f == Flavor.CHEESECAKE) {
            System.out.println("I love cheesecake in my ice-cream.");
        }
    }
}
