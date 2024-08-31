package loops;

public class BreakAndContinue {
    public static void main(String[] args) {
//        Even number using break
       /* System.out.println("Even numbers from 1 to 50");
        for (int i = 1; i <50; i++) {
            if (i%2==0){
                System.out.println(i);
                if (i>=20)
                    break;
            }
        }
        System.out.println("Odd Numbers: ");
        for (int j = 1; j < 50; j+=2) {
            System.out.println(j);
            
        }*/
        
//        Continue Statement
        /*for (int i = 0; i <= 20; i++) {
            //if (i>=15)break;
            if ( i>=15 || i==2 || i==10)continue;
            System.out.println("Gave toffee to "+i);
        }*/

//        Nested loops = display 1,2,3,4,5 10 times
        /*for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j+" ");
            }
            System.out.println("Printed "+i);
        }*/

//        Labeled break and continue
        outerLoop:
        for (int i = 0; i < 10 ; i++) {
            int j =0;
            while (j <= 5){
                if (j == 5) break outerLoop;
                System.out.print(j+" ");
                j++;

            }
            System.out.println();
        }


    }
}
