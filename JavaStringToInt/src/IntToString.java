public class IntToString {

    public static void main(String[] args) {

        String s = "age: 23";
        s = s.replaceAll("\\D+",""); //String to Int method.

        int n = Integer.parseInt(s);
        System.out.println(s);
        System.out.println(n + 2);
    }
}

