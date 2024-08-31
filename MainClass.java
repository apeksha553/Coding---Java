package oops1;
import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog a = new Dog();
        System.out.println("Enter dog name: ");
        a.name = sc.nextLine();
        a.walk();
        Dog a1 = new Dog();
        System.out.println("Enter age: ");
        a1.age = sc.nextInt();
        a1.name = a.name;
        a1.bark();
    }
}

class Dog{
    String name;
    int age;
    void walk(){
        System.out.println(name+" is walking!");
    }
    void bark(){
        if (age >= 14){
            System.out.println(name+" is old");
        }else System.out.println(name+" is young");
    }
}
