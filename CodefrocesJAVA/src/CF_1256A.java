

import java.util.Scanner;

/**
 *
 * @author MDTus
 */
public class CF_1256A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        
        for(int i=0; i<q; i++){
            long a = input.nextLong();
            long b = input.nextLong();
            long n = input.nextLong();
            long S = input.nextLong();
            
            long c = S%n;
            if(c>b)System.out.println("No");
            else{
                long T = (a*n)+b;
                if(T>=S)System.out.println("Yes");
                else System.out.println("No");
            }
        }
    }
}
