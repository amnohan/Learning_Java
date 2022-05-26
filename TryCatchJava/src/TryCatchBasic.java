public class TryCatchBasic {
    public static void main(String[] args) {
        try {
        int[] n = {1,3,5,7};
        System.out.println(n[4]);
        }catch (Exception e) {   //Exception e is generic version of exception.
            System.out.println("Index is out of bound!");
        }
    }
}
