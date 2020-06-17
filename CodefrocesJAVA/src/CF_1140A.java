
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
public class CF_1140A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[]arr = new int[n+1];
        
        for(int i=1; i<=n; i++)
            arr[i]=input.nextInt();
        int d=0;
        for(int i=1; i<=n; ){
            int lt = arr[i];
            for(int j=i; j<=lt;j++){
                if(arr[j]>lt)lt=arr[j];
                //System.out.print(arr[j]+" ");
                i=j+1;
            }d++;
            //System.out.println("");
        }
        System.out.println(d);
    }
}
