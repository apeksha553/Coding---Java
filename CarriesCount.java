import java.util.*;
class CarriesCount{
    public static int NumberOfCarries(int num1, int num2){
        int sum = 0;
        int count = 0;
        int temp1=num1, temp2=num2;
        while (temp1 != 0 && temp2 != 0){
            int d1 = temp1 % 10 , d2 = temp2 % 10;
            if (d1 + d2 + sum > 9){
                count++;
                sum = d1 + d2 + sum;
                sum = sum / 10;
            }
            temp1 = temp1/10;
            temp2 = temp2/10;
        }
        while (temp1 != 0){
            if (sum + temp1 > 9){
                count++;
                sum = temp1 + sum;
                sum = sum / 10;
            }
            temp1 = temp1/10;
        }
        while (temp2 != 0){
            if (sum + temp2 > 9){
                count++;
                sum = temp2 + sum;
                sum = sum / 10;
            }
            temp2 = temp2/10;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(NumberOfCarries(num1,num2));
    }
}