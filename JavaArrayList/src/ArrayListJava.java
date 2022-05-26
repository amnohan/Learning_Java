import java.util.ArrayList;

public class ArrayListJava {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Strawberry");

        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.get(2));

        /* This ArrayList is lot cleaner than regular Array.
           We can easily remove, add and check the elements of ArrayList.
         */
    }
}
