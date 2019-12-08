
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
public class CF_1118A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        
        for(int I=0; I<q; I++){
            long n = input.nextLong();
            long a = input.nextInt();
            long b = input.nextInt();
            
            System.out.println((n/2)* Math.min(2*a,b)+(n%2)*a);
        }
    }
}
