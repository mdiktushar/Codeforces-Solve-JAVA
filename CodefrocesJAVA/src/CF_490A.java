
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
public class CF_490A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();        
        int a = 0, b = 0, c = 0;
        int[] P = new int[5000];
        int[] M = new int[5000];
        int[] PE = new int[5000];
        for(int i=0; i<n; i++){
            int f = input.nextInt();
            switch (f) {
                case 1:
                    P[a++] = i+1;
                    break;
                case 2:
                    M[b++] = i+1;
                    break;
                default:
                    PE[c++] = i+1;
                    break;
            }
        }
        if(a==0 || b==0 || c==0){
            System.out.println(0);
            return;
        }
        int A = Math.min(a, b);
        A = Math.min(A, c);
        System.out.println(A);
        for(int i=0; i<A; i++){
            System.out.println(P[i]+" "+M[i]+" "+PE[i]);
        }
    }
}