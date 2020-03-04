
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
public class CF_1304A {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int t = input.nextInt();
        
        for(int i=0; i<t; i++){
            
            long x = input.nextLong();
            long y = input.nextLong();
            long a = input.nextLong();
            long b = input.nextLong();
            
            if((y-x)%(a+b) == 0)
                System.out.println((y-x)/(a+b));
            else System.out.println(-1);
        }
    }
}
