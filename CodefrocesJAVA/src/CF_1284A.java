
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
public class CF_1284A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        
        String[] S1 = new String[n];
        String[] S2 = new String[m];
        
        for(int i=0; i<n; i++){
            S1[i] = input.next();
        }
        for(int i=0; i<m; i++){
            S2[i] = input.next();
        }
        int q = input.nextInt();
        for(int i=0; i<q; i++){
            int y = input.nextInt();
            
            int a = (y-1)%n;
            int b = (y-1)%m;
            System.out.println(S1[a]+S2[b]);
        }
    }
}
