package arrays;
import  java.util.*;

public class ApnaClg2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        2D Array ex
        /*System.out.println("Enter no. of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter no. of columns: ");
        int col = sc.nextInt();
        //declare array
        int arr[][] = new int[row][col];

        //input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter element in array: ");
                arr[i][j] = sc.nextInt();
            }
        }
        //output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/

//        take matrix as input from user search for given no and print the indices at which occurs
        System.out.println("Enter no. of rows: ");
        int row =sc.nextInt();
        System.out.println("Enter no. of columns: ");
        int col =sc.nextInt();
        int arr[][] = new int[row][col];
        //input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter element to search: ");
        int ele = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (ele == arr[i][j]){
                    System.out.println("Element is found at index "+i+", "+j);
                }
            }
        }
    }
}
