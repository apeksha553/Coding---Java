package oops1;
import java.util.*;

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Greet g1 = new Greet();
        g1.greetings();
        System.out.println("Enter name; ");
        g1.name = sc.next();
        System.out.println("Enter count; ");
        g1.count = sc.nextInt();
        g1.greetings(g1.name);
        g1.greetings(g1.name, g1.count);

    }
}

class  Greet{
    String name;
    int count;
    void greetings(){
        System.out.println("Hello good morning!");
    }
    void  greetings(String name){
        System.out.println("Hello "+name+", Good Morning!");
    }

    void greetings(String name, int count){
        for (int i = 1; i <= count; i++) {
            System.out.println("Name is: "+name);
        }
    }
}
