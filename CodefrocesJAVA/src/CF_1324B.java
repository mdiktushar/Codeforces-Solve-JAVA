
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MDTus
 */
public class CF_1324B {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int t = input.nextInt();
        while(t!=0){
            
            int n = input.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = input.nextInt();
            }
            int f = 0;
            for(int i=n-3; i>=0; i--){
                for(int j = i+2; j<n; j++){
                    if(arr[i] == arr[j]){
                        f++; break;
                    }
                }
                if(f != 0)
                    break;
            }
            if(f==0){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
            t--;
        }
    }
}
