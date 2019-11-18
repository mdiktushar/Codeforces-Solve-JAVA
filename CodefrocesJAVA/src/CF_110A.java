
import java.util.Scanner;

/**
 *
 * @author MDTus
 */
public class CF_110A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int n = str.length();
        char [] arr = str.toCharArray();
        int C = 0;
        for(int i=0; i<n; i++){
            if(arr[i]=='4' || arr[i]=='7')C++;
        }
        if(C==4 || C==7)System.out.println("YES");
        else System.out.println("NO");
    }
}
