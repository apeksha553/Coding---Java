package basics2;
import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        /*System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is "+age);*/
//        System.out.println("Enter first number: ");
        float firstnum = sc.nextFloat();
//        System.out.println("Enter second number: ");
        int secomdnum = sc.nextInt();
        float result = (float)firstnum + secomdnum;
        System.out.println("Result is :"+result);
        sc.close();

    }
}
