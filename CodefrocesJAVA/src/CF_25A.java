
import java.util.Scanner;

public class CF_25A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int odd = 0, even = 0;
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
            if(arr[i]%2 == 0) even++;
            else odd ++;
        }
        if(even>odd){
            for(int i=0; i<n ;i++){
                if(arr[i]%2 != 0){
                    System.out.println(i+1);
                    return;
                }
            }
        }else{
            for(int i=0; i<n; i++){
                if(arr[i]%2 == 0){
                    System.out.println(i+1);
                    return;
                }
            }
        }
        

    }
}
