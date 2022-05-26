import java.util.HashMap;

public class HashMapInJava {
    public static void main(String[] args) {
        int a = 11;
        int b = 17;
        int c = 23;

        HashMap<String, Integer> stored = new HashMap<String, Integer>(); // Key = String & Value = Integer;
        stored.put("a", 11);
        stored.put("b", 17);
        stored.put("c", 23);

        System.out.println(stored);
    }
}
