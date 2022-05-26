import jdk.swing.interop.SwingInterOpUtils;

public class JavaNestedForLoops {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        System.out.println("_____");

        String[] color = {"Red","Blue","Green"};
        for(int i = 0; i < 2; i++) {
            System.out.println(color[0]);
        }

        System.out.println("_____");

          // 99% times have to do this 2d nested for loop

        String[][] fancyColor = { {"Red","Green","Blue"},
                                 {"Yellow", "Pink", "White"}
        };
        for(int i = 0; i < 2; i++) {   // i = row;
            for(int j = 0; j <3; j++) {   // j = column;
                System.out.println(fancyColor[i][j]);
            }
        }
    }
}
