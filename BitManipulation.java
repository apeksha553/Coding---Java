package operators;
import java.util.Scanner;
import java.util.jar.*;

public class BitManipulation {
    public static  void DecToBinary(int n){
        int DecBin[] = new int[32];
        int i = 0;
        while (n > 0){
            DecBin[i] = n%2;
            n= n/2;
            i++;
        }
        for (int j = i-1; j >= 0; j--) {
            System.out.print(DecBin[j]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        get bit
        //get 3rd bit(position 2)
        /*System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Enter position to search: ");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;

        if ((bitMask & n) == 0){
            System.out.println("Bit was 0");
        }else {
            System.out.println("Bit was 1");
        }*/

//        Set bit
        //set a bit to position
        /*System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Enter position to search: ");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        int newNum = bitMask | n;
        System.out.println(newNum);*/

//        clear bit
        /*System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Enter position to search: ");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        int notBitMask = ~bitMask;
        int newNum = notBitMask & n;
        System.out.println(newNum);*/

//        update bit
        /*System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Enter bit to update: ");
         int operation = sc.nextInt();
         if (operation == 0){
             int bitMask = 1<<operation;
             int notBitMask = ~bitMask;
             int newNum = notBitMask & n;
             System.out.println(newNum);
         } else if (operation == 1) {
             int bitMask = 1<<operation;
             int newNum = bitMask | n;
             System.out.println(newNum);
         }else {
             System.out.println("Invalid bit!");
         }*/

//        binary to decimal
        /*System.out.println("Enter Binary number: ");
        String num = sc.nextLine();
        int decimalNum = Integer.parseInt(num, 2);
        System.out.println("Binary number "+num+ " in decimal is "+decimalNum);*/

//       Decimal to binary
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        DecToBinary(n);
    }
}
