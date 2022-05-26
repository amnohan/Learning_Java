public class RealLogicalOpExample {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        boolean isSunny = true;
        boolean imHappy = false;

        if((a < b && isSunny) && (imHappy)) { // For, && both conditions need to be true
            System.out.println("It's gonna be a good day!");
        } else {
            System.out.println("It's gonna be a muddy day!");
        }
    }
}
