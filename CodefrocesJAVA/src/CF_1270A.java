
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
public class CF_1270A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int I=0; I<t; I++){
            int n = input.nextInt();
            int k1 = input.nextInt();
            int k2 = input.nextInt();
            int[] arr1 = new int[k1];
            int[] arr2 = new int[k2];
            for(int i=0; i<k1; i++){
                arr1[i] = input.nextInt();
            }
            for(int i=0; i<k2; i++){
                arr2[i] = input.nextInt();
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(arr1[k1-1]>arr2[k2-1])System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}
