import java.util.*;

public class Practice2 {
    private static void printSpiralOrder(int[][] mat)
    {
        // base case
        if (mat == null || mat.length == 0) {
            return;
        }

        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length - 1;

        while (true)
        {
            if (left > right) {
                break;
            }

            // print top row
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " ");
            }
            top++;

            if (top > bottom) {
                break;
            }

            // print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right] + " ");
            }
            right--;

            if (left > right) {
                break;
            }

            // print bottom row
            for (int i = right; i >= left; i--) {
                System.out.print(mat[bottom][i] + " ");
            }
            bottom--;

            if (top > bottom) {
                break;
            }

            // print left column
            for (int i = bottom; i >= top; i--) {
                System.out.print(mat[i][left] + " ");
            }
            left++;
        }
    }
//    static final int R = 3;
//    static final int C = 6;

    // Function to form the spiral matrix

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Row and Col: ");
        int R = sc.nextInt();
        int C = sc.nextInt();
        /*int arr[] = {1, 2, 3, 4, 5, 6,
                7, 8, 9, 10, 11, 12,
                13, 14, 15, 16, 17, 18};*/
//        int arr[] = new int[R*C];
//        for (int i = 0; i < (R*C); i++){
//            arr[i] = sc.nextInt();
//        }
        int mat[][] = new int[R][C];
        for (int i = 0; i < R; i++){
            for (int j = 0; j < C; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++){
                System.out.println(mat[i][j]+ " ");
            }
        }
        printSpiralOrder(mat);
        //formSpiralMatrix(mat, R, C);
        //printSpiralMatrix(mat, R, C);
    }
}