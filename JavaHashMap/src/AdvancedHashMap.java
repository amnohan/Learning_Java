import java.util.HashMap;

public class AdvancedHashMap {
    public static void main(String[] args) {
        HashMap<String,String> idPassword = new HashMap<String, String>();
        idPassword.put("billmurphy1969", "fluffyp00sy@");
        idPassword.put("bobjones31","b3tt3rp@ssword!");
        idPassword.put("mountnalive","007nation@l");

        System.out.println(idPassword);   // To check HashMap
        System.out.println(idPassword.size()); // To check size of the HashMap.

        idPassword.remove("bobjones31"); // To remove item from HashMap.

        System.out.println(idPassword);  // To check HashMap.
        System.out.println(idPassword.containsKey("mountnalive")); // To check contain key.
        System.out.println(idPassword.containsKey("bobjones32"));
        System.out.println(idPassword.containsValue("007nation@l"));  // To check contain value.
        System.out.println(idPassword.containsValue("b3tterp@ssword!"));
        System.out.println(idPassword);  // To check HashMap
        System.out.println(idPassword.replace("billmurphy1969", "7n@tionarmy!"));  // To replace item in HashMap
        System.out.println(idPassword);
    }
}