public class BooleanJava {

    public static void main(String[] args) {
        boolean passedDoor = true;   // if true, then everything will print.
        boolean missedDoor = false;  // if false, then nothing will print.

        if (passedDoor) {
            System.out.println("We passed the first door.");
        }
        if (passedDoor) {
            System.out.println("We passed the second door.");
        }
        if (missedDoor) { // missedDoor = false, So nothing will print for this statement.
            System.out.println("We passed the third door.");
        }
        if (passedDoor) {
            System.out.println("We passed the fourth door.");
        }
        if (passedDoor){
            System.out.println("SORRY MISSION FAILED!!!");
            System.out.print("\t(missed the third door,");
            System.out.println(" better luck next time.)");
        }
    }
}
