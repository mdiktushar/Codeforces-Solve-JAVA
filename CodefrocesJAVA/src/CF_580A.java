
import java.util.Arrays;
import java.util.Scanner;

public class CF_580A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long [] count = new long[n];
        long [] arr = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        int R = 0;
        int j = 0;
        for(int i=0; i<n; i++){count[i]=1;}
        for(int i=0; i<n-1; i++){
            if(arr[i]<=arr[i+1])count[j]++;
            else {
                j++;
            }
        }
        Arrays.sort(count);
        System.out.println(count[n-1]);
    }
}
