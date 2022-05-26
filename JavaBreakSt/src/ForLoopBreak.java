public class ForLoopBreak {
    public static void main(String[] args) {
        int[] numbers = {0,5,10,15,20,25,30,35,40,45,50};
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] ==30) {  // Use if statement to break here;
                break;
            }
            System.out.println(numbers[i]);
        }
    }
}
