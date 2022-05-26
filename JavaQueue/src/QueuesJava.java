import java.util.LinkedList;
import java.util.Queue;

public class QueuesJava {
    public static void main(String[] args) {

        Queue<String> foodLine = new LinkedList<String>();  //Queue's new object should be LinkedList.
        foodLine.add("Rizeek Nohan");
        foodLine.add("Injeel Nohan");
        foodLine.add("Sonia Nohan");
        foodLine.add("Anik Nohan");

        //foodLine.poll(); // To remove the first one from Queue;
        //poll() and peek() are the most usable in Java Queues.

        System.out.println(foodLine);
        System.out.println(foodLine.size());
        System.out.println(foodLine.peek());  // To see the queue list from first to last without removing values.
        System.out.println(foodLine.contains("Azaan Nohan"));
        System.out.println(foodLine.toArray()[1]); // To see through array list
        System.out.println(foodLine.poll());
        System.out.println(foodLine);

    }
}