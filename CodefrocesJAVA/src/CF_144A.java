
import java.util.Scanner;

public class CF_144A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        int max = -999999;
        int min = 999999;
        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0; i<n; i++){
            if(max == arr[i]){
                max = i+1;
                break;
            }
        }
        for(int i=n-1; i>=0; i--){
            if(min == arr[i]){
                min = i+1;
                break;
            }
        }
        if(max>min)max--;
        max = max-1;
        min = n-min;
        System.out.println(max+min);
        
    }
}
