
import java.util.Scanner;


public class CF_791A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        a = input.nextInt(); b = input.nextInt();
        for(int i=1; ; i++){
            a *= 3;
            b *= 2;
            if(a>b){System.out.println(i);break;}
        }
    }
}
