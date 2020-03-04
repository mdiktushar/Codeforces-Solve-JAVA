
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
public class CF_540A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int n = input.nextInt();
        String s1,s2;
        s1 = input.next();
        s2 = input.next();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        
        for(int i=0; i<n; i++){
            int f1 = ch1[i];
            a1[i] = f1-48;
            f1 = ch2[i];
            a2[i] = f1-48;
        }
//        for(int i=0; i<n; i++){
//            System.out.print(a1[i]);
//        }System.out.println("");
//        for(int i=0; i<n; i++){
//            System.out.print(a2[i]);
//        }System.out.println("");
        int sum = 0;
        for(int i=0; i<n; i++){
            int mx = Math.max(a1[i], a2[i]);
            int mi = Math.min(a1[i], a2[i]);
            int f1 = mx - mi;
            int f2 = (9-mx)+mi+1;
            int res = Math.min(f1, f2);
            //System.out.println("Point: "+res);
            sum += res;
        }System.out.println(sum);
    }
}
