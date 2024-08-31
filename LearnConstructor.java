package oops1;
import java.util.*;

public class LearnConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        Construct c = new Construct(a, b);
        c.print(a, b);

    }
}

class Construct{
    int a, b;

    public  Construct(int a, int b){
    }
    void print(int a, int b){
        System.out.println(a+" + "+b+" i ");
    }
}
