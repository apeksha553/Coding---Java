import java.util.*;

public class ReplaceChar {
    public static void ReplaceCharacter(String str, char ch1, char ch2, int n ){
        //int n = str.length();
        char[] s = str.toCharArray();
        if (ch1 == ch2) {
            System.out.println("String Unchanged");
        }
        for (int i = 0; i < n; i++){
            if (s[i] == ch1){
                s[i] = ch2;
            } else if (s[i] == ch2) {
                s[i] = ch1;
            }
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        ReplaceCharacter(str, ch1, ch2, n);
    }
}
