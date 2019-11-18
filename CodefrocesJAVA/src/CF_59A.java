
import java.util.Scanner;


public class CF_59A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int n = str.length();
        char[] S = str.toCharArray();
        int u=0,l=0;
        for(int i=0; i<n; i++){
            if(S[i] >= 97)l++;
            else u++;
        }
        if(l>=u){
            for(int i=0; i<n; i++){
                if(S[i]<97)S[i] += 32;
                System.out.print(S[i]);
            }System.out.println();
        }
        else{
            for(int i=0; i<n; i++){
                if(S[i]>90)S[i] -= 32;
                System.out.print(S[i]);
            }System.out.println();
        }
    }
}
