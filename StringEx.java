package string;
import  java.util.*;
public class StringEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String in = sc.next();
        System.out.println("Enter your second name: ");
        String in1 = sc.next();

        //concat fun
        /*String con =in +" "+ in1;
        System.out.println("Concatenated string is: "+con);
        //System.out.println("Concatenated string is: "+in.concat( in1));

        //length fun
        System.out.println("Length of string is: "+con.length());

        //print every single character in string
        //charAt function
        for (int i = 0; i < con.length(); i++) {  //print every char
            System.out.println(con.charAt(i));
        }*/

        //compare fun
        //String s1 = sc.next();
        //String S2 = sc.next();
        /*if (in.compareTo(in1) == 0){
            System.out.println("Strings are equal");
        }else System.out.println("Strings are not equal!");*/
        if (in.compareTo(in1) > 1){
            System.out.println("String 1 is big");
        }else {
            System.out.println("String 2 is big");
        }

        if (in.compareTo(in1) < -1){
            System.out.println("strings 1 is small");
        }else System.out.println("string 2 is small");

        String sentence = "My name is apeksha";
        String name = sentence.substring(11, 18); //ending index by default
        System.out.println(name);
    }

}
