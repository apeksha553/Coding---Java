package conditionalStatement;
import java.sql.Time;
import java.util.Calendar;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        //for (int i=1; i<100; i++) {
            System.out.println("Enter Your age: ");
            int age = sc.nextInt();

            if (age >= 18) {
                System.out.println("You can vote!");
            } else {
                System.out.println("You are not eligible to vote");
            }
        int cut = sc.nextInt();
        if ( cut>=30){
            System.out.println("You are old");

        }
        System.out.println("wow");
        //}*/

//        if-else-if
       /* System.out.println("Enter day till number 5: ");
        int day = sc.nextInt();
        if(day == 1){
            System.out.println("Go to home");
        } else if (day==2) {
            System.out.println("Go to village");
        } else if (day==3) {
            System.out.println("Party");
        }else if (day==4) {
            System.out.println("Party");
        }else {
            System.out.println("Office..");
        }
        System.out.println("Hangout");*/

//        You are given 3 num, find large no(nested if-else)
       /* System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();
        if (a>b){
            if (a>c){
                System.out.println("a is largest");
            }else {
                System.out.println("c is largest");
            }
        }else {
            if (b>c){
                System.out.println("b is largest");
            }else {
                System.out.println("c is largest");
            }
        }*/

//        for 4 input
        /*System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();
        System.out.println("Enter d: ");
        int d = sc.nextInt();
        if (a>b){
            if (a>c){
                if (a>d){
                    System.out.println("a is largest");
                }else {
                    System.out.println("d is largest");
                }
            }else {
                if (c>d){
                    System.out.println("c is largest");
                }else {
                    System.out.println("d is largest");
                }
            }
        }else {
            if (b>c){
                if (b>d){
                    System.out.println("b is largest");
                }else {
                    System.out.println("d is largest");
                }
            }else {
                if (c>d){
                    System.out.println("c is largest");
                }else {
                System.out.println("d is largest");
                }
            }
        }*/

//        Ternary Operator

        /*System.out.println("enter a, b, c and d: ");
        int a= sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int d =sc.nextInt();
        int maz=0;
        int max=0;*/

        //to replace this:
        /*
        if (a>b){
            maz=a;
        }else {
            maz=b;
        }
        System.out.println("maz is "+maz);*/

//        Ternary implements as:
        //maz = a>b ? a : b;
        //System.out.println("max is "+maz);

//        Nested ternary:
        /*maz = a>b ? a>c ? a>d ?a:d:c>d? c:d: b>c? b>d? b:d: c>d? c:d;
        System.out.println("max is "+maz); //for 4 input
        max = a>b? a>c? a:c: b>c? b:c;
        System.out.println("Max is: "+max); //for 3 input*/


//       Que time= office open from 10am to 8pm (24 hrs clock)
//        display office is open or not
        System.out.println("Enter time:");
        int time = sc.nextInt();
        if (time>=10 && time<=20){
            System.out.println("Office is open!");
        }
        else {
            System.out.println("Office is closed!");
        }
    }
}
