import java.util.HashSet;

public class HashSetInJava {
    public static void main(String[] args) {
        HashSet<String> hashBrown = new HashSet<String>();
        hashBrown.add("SONIA");
        hashBrown.add("INJEEL");
        hashBrown.add("ANIK");
        hashBrown.add("NOHAN");

        System.out.println(hashBrown);
        System.out.println(hashBrown.size());
        System.out.println(hashBrown.iterator().next());
        System.out.println(hashBrown.isEmpty());
        System.out.println(hashBrown.contains("NOHAN"));
        System.out.println(hashBrown.hashCode());

        Object[] hashBro = hashBrown.toArray();
        System.out.println(hashBro[1]);
    }
}
