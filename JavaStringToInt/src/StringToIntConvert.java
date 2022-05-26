public class StringToIntConvert {

    public static void main(String[] args) {

        String s ="102";

        System.out.println(s+4); //This will print 1024 cuz 102 work as an String!

        //To print 102+4 =106 We can use
        System.out.println(Integer.parseInt(s)+4);

        //or convert string to int way;

        int n = Integer.parseInt(s);
        System.out.println(n + 4);
    }
}
