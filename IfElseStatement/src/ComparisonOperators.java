public class ComparisonOperators {
    public static void main (String[] args){

        // == is equal to;
        // != not equal to;
        // <= less than or equal to;
        // >= greater than or equal to;
        // && and
        // || or
        int a = 5;
        int b = 4;

        if (a ==5 || b==3) {
            System.out.println("This is printing as one of the condition is true");
            // To print || OR, one of the condition need to be true.
        }
        if (a ==5 && b !=a) {
            System.out.println("This is not going to print unless both conditions become true");
            // To print && AND, All conditions must need to be true.
        }
    }
}
