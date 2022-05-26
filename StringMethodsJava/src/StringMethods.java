public class StringMethods {

    public static void main(String[] args) {
        System.out.println("\nPut Your Information Below: ");

        String name = "Anik M Nohan";
        System.out.println("\nName: " + name + ".");
        System.out.println("Upper Case: " +name.toUpperCase() + ".");
        System.out.println("Lower Case: " + name.toLowerCase() + ".");
        System.out.println("First Initial: " + name.charAt(0) + ".");
        System.out.println("Middle Initial: " + name.charAt(5) + ".");
        System.out.println("Last Initial: " + name.charAt(7) + ".");
        System.out.println("Length: " + name.length() + ".");
        System.out.println("Substring: " + name.substring(6,12) + "."); // Remember this.

    }
}
