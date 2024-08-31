package arrays;
import java.util.*;

public class ArrayApnaClg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        initialize and access array element
        /*int arr[]={12, 13, 14, 15};
        System.out.println("Array Length = "+arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

//        User Input
        /*System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int num[]= new int[size];
        //input
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element at index "+i);
            num[i] = sc.nextInt();
        }
        //output
        System.out.println("Output");
        for (int i = 0; i < size; i++) {
            System.out.println("Element at index "+i+" is "+num[i]);
        }*/

//        Take an array as input from user. search for given number x and print the index at which it occurs
        System.out.println("Enter an array size: ");
        int size = sc.nextInt();
        int arr[] =  new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        int ele = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==ele){
                System.out.println(ele+" is present at index "+i);
            }
        }
    }
}
