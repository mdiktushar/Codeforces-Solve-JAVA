
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
public class CF_1300A {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int t = input.nextInt();
        
        for(int i=0; i<t; i++){
            
            int n = input.nextInt();
            int[] arr = new int[n];
            int f = 0;
            int sum = 0;
            for(int j=0; j<n; j++){
                int a = input.nextInt();
                if(a == 0){
                    f += 1;
                    arr[j] = 1;
                }else arr[j] = a;
                
                sum += arr[j];
            }
            
            if(sum == 0){
                f++;
            }System.out.println(f);
        }        
    }
}
