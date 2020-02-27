
import java.util.Arrays;
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
public class CF_1294A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long t = input.nextLong();
        
        for(long i=0; i<t; i++){
            
            long[] arr = new long[3];
            
            for(int j=0; j<3; j++){
                arr[j] = input.nextLong();
            }
            long n = input.nextLong();
            
            Arrays.sort(arr);
            
            long P = arr[2] - arr[1];
            P = P + (arr[2] - arr[0]);
            n = n-P;
            
            long F;
            
            if(n<0){
                System.out.println("NO");
                continue;
            }else if(n==0){
                System.out.println("YES");
                continue;
            }else{
                F = n%3;
            }
            if(F != 0){
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");            
        }
    }
}
