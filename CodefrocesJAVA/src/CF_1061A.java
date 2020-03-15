
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
public class CF_1061A {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        long n = input.nextLong();
        long S = input.nextLong();
        
        if(n>S)
            System.out.println(1);
        else{
            long f = S/n;
            if(S%n != 0)
                f++;
            System.out.println(f);
        }
    }
}
