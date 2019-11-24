
import java.util.Scanner;

public class CF_344A {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int f = 1;
        int a = input.nextByte();
        for(int i=1; i<n; i++){
            int num = input.nextInt();
            if(num != a)f++;
            a = num;
        }System.out.println(f);
    }
}
