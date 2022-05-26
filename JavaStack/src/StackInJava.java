import java.util.Stack;

public class StackInJava {
    public static void main(String[] args) {

        Stack<String> games = new Stack<>();
        games.add("Call of Duty");
        games.add("Fifa2050");
        games.add("Need For Speed");
        games.add("Grand Theft Auto");

        System.out.println(games);
        System.out.println(games.size());
        System.out.println(games.peek()); // To find out the top one.
        System.out.println(games.contains("Super Mario Cart")); // Check the contains.
        System.out.println(games.get(1));

        System.out.println(games.set(1,"Battlefield"));  // To replace
        System.out.println(games);
    }
}
