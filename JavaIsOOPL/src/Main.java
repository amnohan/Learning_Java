public class Main {
    public static void main(String[] args) {

        Car c = new Car();

        System.out.println("Car Year is: " + c.year);
        System.out.println("Brand Name is: " + c.brandName);
        System.out.println("Car Model is: " + c.model);
        System.out.println("Car Size is: " + c.size);
        System.out.println("Color is: " + c.color);
        System.out.println("Car Engine Type is: " + c.engineType);
        System.out.println("Key Less Car Entry: " + Car.clickDoorOpen);

        Car.doorLock();
        System.out.println("Key Less Start: " + Car.clickDoorOpen);
    }
}
