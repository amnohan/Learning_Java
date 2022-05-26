public class ForLoopArray {
    public static void main(String[] args) {
        int[][] cardOne = {{7, 13, 17},     // regular way for 2D array
                           {3, 11, 19},
                           {5, 23, 31}
        };

        for (int i = 0; i <3; i++){          // print diagnol and single box;
            System.out.println(cardOne[i][i]);
        }

        System.out.println("----");


        for (int i = 0; i < 3; i++){          // print all the boxs;
            for (int j = 0; j < 3; j++) {
                System.out.println(cardOne[i][j]);
            }
        }
    }
}

