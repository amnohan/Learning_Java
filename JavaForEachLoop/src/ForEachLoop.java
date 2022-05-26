public class ForEachLoop {
    public static void main(String[] args) {

        String[] cars = {"Range Rover","Escalade","Suburban","Lexus LX"};
        char[] characters ={'a','b','c','d'};
        int[] numbers = {1,3,5,7};

        for(String car : cars) {
            System.out.println(car);
        }
        for(char character : characters) {
            System.out.println(character);
        }
        for(int number : numbers) {
            System.out.println(number);
        }
    }
}
