package arrays;
import  java.util.*;

public class ApnaClgHW1dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        take array of name from user and display
        /*System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        String arr[] = new  String[size];
        //input
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Enter names in array: ");
             arr[i] = sc.next();
        }
        //output
        System.out.println("Names: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);;
        }*/

//        find max & min num in array of integer
        /*System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Enter elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //min & max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);*/

//        is array elements are in ascending order or not
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        //create array
        int arr[] = new int[size];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // ascending order
        /*boolean isAscending = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]){
                isAscending = false;
            }
        }
        if (isAscending == true){
            System.out.println("Array is in ascending order!");
        }else {
            System.out.println("Array is not in ascending order");
        }*/

        //descending order
        boolean desc = false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]){
                desc = true;
            }else desc = false;
        }
        if (desc == true){
            System.out.println("Array is in descending order!");
        }else {
            System.out.println("Array is not in descending order");
        }
    }
}
