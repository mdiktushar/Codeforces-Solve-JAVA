
import java.util.Scanner;

public class CF_977A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        String str = input.next();
        int t = input.nextInt();
        int n = str.length();
        char[] ch = str.toCharArray();
        for(int i=0; i<t; i++){
            if(ch[n-1] == '0'){
                n--;
            }else{
                ch[n-1]--;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(ch[i]);
        }System.out.println("");
    }
}
