import java.util.*;
public class Ex3 {
    public static int productSmallest(int sum, int n, int arr[]){
        if (n <= 2){
            return -1;
        }
        int check, temp;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        check = arr[0]+arr[1];
        if (check <= sum){
            return arr[0]*arr[1];
        }else
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(productSmallest(sum, n, arr));
    }
}
