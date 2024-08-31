package loops;
import java.util.*;

public class PatternProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Rectangle Problem
        /*for (int i = 1; i <= 10; i++) { //how many times loop will execute
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();

        }*/

//      Hollow rectangle(Only outer star inner star missing
        /*for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j==1 || i==4 || j==5) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

//        Triangle pattern
        /*for (int i = 1; i <= 4; i++) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }*/
//        Reverse the above loop
       /* for (int i = 4; i >= 1; i--) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

//        loop inverted 180 degree = 3 loop, outer(i)_total rows j inner loop for printing star and inner loop for space
        /*for (int i = 1; i <= 4; i++) {
            for (int j = 1 ; j <= 4-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

//       half pyramid of numbers
        System.out.println("Enter no. of rows: ");
        int row = sc.nextInt();
//        System.out.println("Enter no. of col: ");
//        int col = sc.nextInt();
        /*for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }*/

//        Inverted half pyramid
        /*for (int i = 1; i <= row; i++) {
            //for space
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
            //for number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/

        //opposite
       /* for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

//        Inverted half pyramid
        int num = 1;
        /*for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i+1; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }*/

        /*for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }*/

//        0 and 1 pattern
        /*for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2 == 0){ //even
                    System.out.print("1 ");
                }else { //odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }*/

//        pyramid
        /*for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }*/

        //invert opp pyramid
        /*for (int i = 1; i <= row; i++) {
            //for space
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            //for number
            for (int j = 1; j <= row-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/

//        reverse pyramid
        /*for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= row-i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

//        Butterfly pattern
        //upper half
       /* for (int i = 1; i <= row; i++) {
            //first part *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space
            int space = 2*(row-i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //second part *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for (int i = row; i >= 1; i--) {
            //first part *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space
            int space = 2*(row-i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //second part *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

//        solid rhombus
        /*for (int i = 1; i <= row; i++) {
            //space
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

//        number pyramid
        /*for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }*/

//        palindrome pattern
        /*for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
            //first half
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            //second half
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/

//        diamond pattern
        /*for (int i = 1; i <= row; i++) {
            //space
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
            //print *
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = row; i >= 1; i--) {
            //space
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
            //print *
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/
       
    }

}
