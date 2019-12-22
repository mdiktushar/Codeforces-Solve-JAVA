
import java.util.Scanner;

public class CF_460A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int sum = n;
        for(int I=0; ; I++){
            int a = n/m;
            n = a+(n%m);
            sum += a;
            if(n<m)break;
        }System.out.println(sum);
    }
}
