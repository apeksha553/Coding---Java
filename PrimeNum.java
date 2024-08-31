import  java.util.*;
public class PrimeNum {
    public static int PrimeSum(int[] arr, int last) {
        int sum = 0;
        boolean isprime = true;
        for (int i = 1; i <= last; i++){
            if (i < 2){
                isprime = false;
                i++;
            }else {
                for (int j = 2; j <= last; j++) {
                    if (i % j == 0) {
                        isprime = false;
                    } else {
                        sum = sum + i;
                        j++;
                    }
                }
            }
        }
        if (isprime){

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int last = sc.nextInt();
        int[] arr = new int[last];
        for (int i = 0; i < last; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(PrimeSum( arr, last));
    }
}
