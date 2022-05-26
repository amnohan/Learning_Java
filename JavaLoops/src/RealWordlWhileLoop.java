import java.util.ArrayList;
import java.util.Scanner;

//This ia a real world while loop example along with ArrayList.

public class RealWordlWhileLoop {

    public static void main (String[] args) {
        String sentence = "Anik Nohan is amazingly gentle!";
        Scanner scan = new Scanner(sentence);
        ArrayList<String> words = new ArrayList<>();  //need deep attention on ArrayList.

        while(scan.hasNext()) {
            words.add(scan.next());
        }
        System.out.println(words);
    }
}
