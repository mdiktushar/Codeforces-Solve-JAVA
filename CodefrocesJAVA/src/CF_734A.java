
import java.util.Scanner;

public class CF_734A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String s = input.next();
        char[] Ch = s.toCharArray();
        int a=0, b=0;
        for(int i=0; i<n; i++){
            if(Ch[i]=='A')a++;
            else b++;
        }
        if(a>b)System.out.println("Anton");
        else if(a<b)System.out.println("Danik");
        else System.out.println("Friendship");
    }
}
