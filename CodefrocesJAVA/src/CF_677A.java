
import java.util.Scanner;

public class CF_677A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n,h;
        n = input.nextInt(); h = input.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            int p = input.nextInt();
            if(p>h)sum+=2;
            else sum+=1;
        }System.out.println(sum);
    }
}
