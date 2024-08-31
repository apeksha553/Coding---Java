package basic1;
import java.util.*;
import java.lang.*;
public class Tp {
        public static void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("When you will be successful! ");
            System.out.println("Enter your hard work in percentage: ");
            int hardwork = sc.nextInt();
            System.out.println("Enter your smart work in percentage: ");
            int smartwork = sc.nextInt();
            if(hardwork == smartwork ){
                System.out.println("You are unbeatable! ");
            } else if (hardwork > smartwork) {
                System.out.println("keep it up! but you need to be more smart! ");
            } else if (hardwork < smartwork) {
                System.out.println("You are on right path but you need hard work as well! ");
            }

        }
    }

