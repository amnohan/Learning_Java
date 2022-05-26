import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaFileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File openFile = new File("/Users/aniknohan/Desktop/Files/File4000.txt");
        Scanner scan = new Scanner(openFile);

        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
    }
}