
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
public class CF_448A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] cu = new int[3];
        int[] me = new int[3];
        int cs = 0, ms = 0;
        for(int i=0; i<3; i++){
            cu[i] = input.nextInt();
            cs += cu[i];
        }
        
        for(int i=0; i<3; i++){
            me[i] = input.nextInt();
            ms += me[i];
        }
        int n = input.nextInt();
        
        int R,F, T = 0;
        R = cs/5;
        T = cs%5;
        if(T!=0)
            R++;
        F = ms/10;
        T = ms%10;
        if(T!=0)
            F++;
        R += F;
        if(R<=n)
            System.out.println("YES");
        else 
            System.out.println("NO");
    }
}
