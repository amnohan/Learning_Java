public class ExampleBreak {
    public static void main(String[] args) {
        int i = 2;
        switch(i) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            default:
                System.out.println("WTF man?");
                break;
        }
    }
}
