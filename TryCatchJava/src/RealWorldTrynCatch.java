public class RealWorldTrynCatch {
    public static void main(String[] args) {
        try {
            int[] n = {4};   // put null to see null example.
        System.out.println(n[1]);
        }
        catch (NullPointerException e) {
            System.out.println("Your array is null!");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Your index is out of bound!");
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }
}
