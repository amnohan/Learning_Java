import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateNewFile {
    public static void main(String[] args) throws IOException {
        File openFile = new File("/Users/aniknohan/Desktop/Files/File4000.txt");
        Scanner scan = new Scanner(openFile);

        String newFile ="";
        while (scan.hasNextLine()) {
            newFile = newFile.concat(scan.nextLine() +" \n"); // To make a new file we have to concatenate in new tab;

           // System.out.println(scan.nextLine());  // This will print in console;
        }
        FileWriter writer = new FileWriter("/Users/aniknohan/Desktop/Files/newFile.txt");  // Make a copy of the file;
        writer.write(newFile);
        writer.close();
    }
}