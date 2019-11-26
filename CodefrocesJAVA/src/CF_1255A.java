
import java.util.Scanner;


public class CF_1255A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int I=0; I<n; I++){
            long a,b;
            a = input.nextInt(); b = input.nextInt();
            a = Math.abs(a-b);
            long count = 0;
            long p;
            p = a/5;
            a -= p*5;
            count =+ p;
            
            p = a/2;
            a -= p*2;
            count += p;
            
            p = a/1;
            a -= p;
            count += p;
            
            System.out.println(count);
        }
    }
}
