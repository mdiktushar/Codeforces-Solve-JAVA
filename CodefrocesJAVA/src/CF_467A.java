
import java.util.Scanner;

public class CF_467A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int t=0;
        for(int i=0; i<n; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = b-a;
            if(c>=2)t++;
        }
        System.out.println(t);
    }
}
