
import java.util.Scanner;


public class CF_136A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = input.nextInt();
        }
        for(int i=1; i<=n; i++){
            for(int j=0; j<n; j++){
                if(i == a[j])System.out.print(j+1+" ");
            }
        }
        System.out.println("");
    }
}
