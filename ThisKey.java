package oops1;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import  java.util.*;

public class ThisKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        ThisWord t = new ThisWord(a,b);
        //2
        System.out.println("Enter a: ");
        int c = sc.nextInt();
        System.out.println("Enter b: ");
        int d = sc.nextInt();
        ThisWord t1 = new ThisWord(c,d);
        t.print();
        t1.print();
        System.out.println("Adding two complex numbers: ");
        ThisWord result = t.add(t1);

        result.print();


    }
}

class ThisWord{
    int a,b;
    public ThisWord(int a, int b){
        this.a = a;  //remove ambiguity
        this.b = b;   // refer current object
    }
    void print(){
        System.out.println(a+" + "+b+"i");
    }


    ThisWord add(ThisWord t1){
        t1.print();
        return new ThisWord(a+t1.a, b+t1.b);
    }
}
