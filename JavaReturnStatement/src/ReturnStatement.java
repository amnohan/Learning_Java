public class ReturnStatement {
    public static void main(String[] args) {

        soniaGoltu(); // #1

        int sum = adding(10, 5); // #2
        System.out.println(sum);

        String shouting = caps("Sonia is a sweet potato!"); // #3
        System.out.println(shouting);

        int[] nohanArray = arrayFromInt(3,5,7);  // #4
        System.out.println(nohanArray[0]);
        System.out.println(nohanArray[1]);
        System.out.println(nohanArray[2]);
    }
    public static void soniaGoltu() {  // #1
        System.out.println("Sonia is a goltu potato!");
    }
    public static int adding(int a, int b) { // #2   if you store data then don't put VOID;
        return a + b;
    }
    public static String caps(String s) {    // #3
        return s.toLowerCase();
    }
    public static int[] arrayFromInt(int a, int b, int c) {   //#4
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        return array;
    }
}
