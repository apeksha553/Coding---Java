package loops;
import javax.swing.plaf.IconUIResource;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        While Loop
        /*boolean hasLearnt= false;
        while (!hasLearnt){
            System.out.println("went to school");
            System.out.println("Have you understood?");
            hasLearnt= sc.nextBoolean();
        }*/

//        DoWhile Loop
        System.out.println("Enter how many times you want to display message out of 10");
        int n = sc.nextInt();
        do {
            System.out.println("This is DoWhile Loop!");
            n++;
        }while (n<=10);
        System.out.println("Out of the loop!");



    }
}
