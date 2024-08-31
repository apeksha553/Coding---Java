import  java.util.*;

public class RatFood {
    public static int ratFood(int r, int unit, int[] arr, int n){
        int count = 0;
        int amt = 0;
        int total = r * unit;
        if(arr == null){
            return -1;
        }
        for (int i = 0; i < n-1; i++){
            amt += arr[i];
            count++;
            if(amt >= total){
                break;
            }
        }
        if(amt < total){
            return 0;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for ( int i=0; i < n-1; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(ratFood(r, unit, arr, n));
    }


}
