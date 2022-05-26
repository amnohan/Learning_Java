public class Java2Darray {

    public static void main(String[] args) {

        // [][] 2 boxes for 2D Array in JAva.
        // 1st box for [rows], 2nd box is for [columns].

        int[][] cardOne = {{7,13,17},     // regular way for 2D array
                           {3,11,19},
                           {5,23,31}
        };
        int [][] cardTwo = new int[3][3];  // another way for 2D array.
        // [3][3] we put 3 cuz it is 3 rows of 2D.
        cardTwo[0][0] = 7;
        cardTwo[0][1] = 13;
        cardTwo[0][2] = 17;
        cardTwo[1][0] = 3;
        cardTwo[1][1] = 11;
        cardTwo[1][2] = 19;
        cardTwo[2][0] = 5;
        cardTwo[2][1] = 23;
        cardTwo[2][2] = 31;

        System.out.println(cardOne[0][2]);
        System.out.println(cardTwo[2][2]);
    }
}