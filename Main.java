package basic1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = "+i);
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            if (i%2==0){
                System.out.println("i is "+i+" then even");
            }else {
                System.out.println("i is "+i+" then odd");
            }


        }
        float pd = 3.14f;
        int a=130;
        System.out.println(pd);
        long longint = a;
        System.out.println(longint);
        int b = (int)longint;
        System.out.println(b);
        byte by = (byte)a;
        System.out.println(by);

    }
}