import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {
    public static void main(String[] args) {

        HashSet<Integer> hashBrown = new HashSet<Integer>();
        hashBrown.add(7);
        hashBrown.add(11);
        hashBrown.add(17);
        hashBrown.add(23);

        Iterator<Integer> it = hashBrown.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

  // Have to study deep about this iterator in Java HashSet.