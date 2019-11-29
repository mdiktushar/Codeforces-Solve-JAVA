
import java.util.Scanner;


public class CF_705A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2 != 0)System.out.print("I hate");
            else System.out.print("I love");
            if(i < n)System.out.print(" that ");
        }
        System.out.println(" it");
    }
}
