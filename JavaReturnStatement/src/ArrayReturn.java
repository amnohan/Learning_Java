public class ArrayReturn {
    public static void main(String[] args) {
        int[] nohanArray = arrayFromInt(3, 5, 7);

        System.out.println(nohanArray[0]);
        System.out.println(nohanArray[1]);
        System.out.println(nohanArray[2]);
    }
    public static int[] arrayFromInt(int a, int b, int c) {
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        return array;
    }
}
