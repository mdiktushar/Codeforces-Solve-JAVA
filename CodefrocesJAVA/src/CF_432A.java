
import java.util.Arrays;
import java.util.Scanner;

public class CF_432A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int y = input.nextInt();
        y = 5-y;
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        
        Arrays.sort(arr);
        int f = 0,count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] <= y)f++;
            else break;
            if(f == 3){
                count++; f = 0;
            }
        }System.out.println(count);
    }
}
