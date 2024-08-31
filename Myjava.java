import java.util.*;
class Myjava{
    public static int differenceOfSum(int m, int n){
        int sum1 = 0;
        int sum2 = 0;
        for(int i=1; i<=m; i++){
            if(i % n == 0){
                sum1 = sum1 + i;
            }
            else{
                sum2 = sum2 + i;
            }
        }
        return Math.abs(sum2 - sum1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(differenceOfSum(m, n));
    }

}