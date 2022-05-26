public class Car {
    /* OOP is a type of programming that is based on objects rather than just functions and procedures.
   Objects are the first things have to think before designing the programs.
   For example; to explain a car, we have to explain its color, size, brand name, model, year, engine type etc.
    */
    String color = "Black";
    String size = "SUV";
    String brandName = "Honda";
    String model = "CRV";
    int year = 2022;
    double engineType = 2.0;
    static boolean clickDoorOpen = true;

    public static void doorOpen() {
        clickDoorOpen = true;
    }
    public static void doorLock() {
        clickDoorOpen = true;
    }
}
