// Abstract class is a bunch of variables and method that can be used to create other class.
// Abstract method is a method that ain't implemented yet.
// Alex Lee Video

abstract class Dog {
    public void bark() {
        System.out.println("Bark!");
    }
}
class Husky extends Dog {
    public void poop() {
        System.out.println("Dog pooped!");
    }
        public void eat() {
            System.out.println("Dog eats chicken!");
    }
}
public class AbsClassJava {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.bark();
        h.poop();
        h.eat();
    }
}