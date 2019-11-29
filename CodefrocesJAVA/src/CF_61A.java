
import java.util.Scanner;

public class CF_61A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S1,S2;
        S1 = input.next(); S2 = input.next();
        char[] ch1 = S1.toCharArray();
        char[] ch2 = S2.toCharArray();
        int n = S1.length();

        for(int i=0; i<n; i++){
            if(ch1[i] == ch2[i]){
                System.out.print(0);
            }else System.out.print(1);
        }
        System.out.println("");
    }
}