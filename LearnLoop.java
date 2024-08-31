package loops;
import java.util.Scanner;

public class LearnLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        for loop
        /*System.out.println("Enter till what you want to print even numbers: ");
        int a= sc.nextInt();
        System.out.println("Even Numbers are: ");
        for (int i=0; i<=a; i++){

            if (i%2==0){

                System.out.println(i);
//            }else {
//                System.out.println(i+" is odd");
        }*/

            //table
        /*System.out.println("Enter Number: ");
        int table=sc.nextInt();
        System.out.println("Table of "+table);
        for (int i=1; i<=10; i++) {
            System.out.println(table+" * "+i+" = "+table*i);
        }*/

//        sum of natural no
       /* System.out.println("Enter natural number till you want sum: ");
        int num = sc.nextInt();
        int sum=0;
        for (int i=1; i<=num; i++){
            sum=sum+i*2;

        }
        System.out.println(sum);*/

//           sum of natural EVEN num
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int sum1= 0;
        for (int i=1; i<=n*2; i++){
            if (i%2==0){
                for (int j=i; j<=i ; j++){
                    sum1=sum1+j;
                }
            }
        }
        System.out.println(sum1);



//        While loop
    }
}
