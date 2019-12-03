
import java.util.Scanner;

public class CF_1030A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int f = 0;
        for(int i=0; i<n; i++){
            int p = input.nextInt();
            if(p!=0)f++;
        }
        if(f>0){
            System.out.println("hard");
            return;
        }System.out.println("easy");
    }
}
