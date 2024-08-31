package string;
import  java.util.*;

import java.util.Scanner;

public class stringBuilder {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println("String Builder"+sb);
        System.out.println("CharAt: "+sb.charAt(0));
        sb.setCharAt(0, 'P');
        System.out.println("setCharAt: "+sb);

        //add char in string
        //sb.insert(0, 'S');
        //Pony to Ponny
        sb.insert(2, 'n');
        System.out.println(sb);

        //delete extra n
        sb.delete(2, 3);
        System.out.println(sb);

        //append
        System.out.println(sb.append("Tale"));
        sb.length();

        //reverse string
        //System.out.println(sb.reverse());
        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
