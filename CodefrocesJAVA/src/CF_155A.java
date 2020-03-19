
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
public class CF_155A {
    private int n = 0;
    public CF_155A(int n){
        this.n = n;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 
        int n = input.nextInt();
        CF_155A ob = new CF_155A(n);
        int[] arr = new int[n]; 
        for(int i=0; i<n; i++)
            arr[i] = input.nextInt();
        int flag = 0;
        if(n==1){
            System.out.println(flag);
            return;
        }
        
        for(int i=1; i<n; i++){
            Arrays.sort(arr, 0, i);
            if(arr[i]<arr[0])
                flag++;
            else if(arr[i]>arr[i-1])
                flag++;
        }System.out.println(flag);
        
    }
}

