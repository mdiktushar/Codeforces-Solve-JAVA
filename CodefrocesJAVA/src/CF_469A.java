
import java.util.Scanner;


public class CF_469A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int n1 = input.nextInt();
        int[]arr1 = new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i] = input.nextInt();
        }
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i] = input.nextInt();
        }
        
        int n = n1+n2;
        int[] arr = new int[n];
        int I=0;
        for(int j=0; j<n1; j++){
            arr[I++] = arr1[j];
        }
        for(int j=0; j<n2; j++){
            arr[I++] = arr2[j];
        }
        for(int i=1; i<=N; i++){
            int f=0;
            for(int j=0; j<n; j++){
                if(i==arr[j]){
                    f++;break;
                }
            }
            if(f==0){
                System.out.println("Oh, my keyboard!");return;
            }
        }System.out.println("I become the guy.");
    }
}
