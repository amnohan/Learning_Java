public class ReturnMethodParameter {

    public static void main(String[] args) {
        int result = addParameter(5,7); // Just change the value here to get updated result;
        int result1 = addParameter(6, 8);
        int result2 = addParameter(7, 9);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
    public static int addParameter(int x, int y) {
        return x * y;
    }
}

