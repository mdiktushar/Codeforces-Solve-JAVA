
import java.math.BigInteger;
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
public class CF_913A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String m = input.next();
        BigInteger M = new BigInteger(m);
        BigInteger two = new BigInteger("2");
        two = two.pow(n);
        System.out.println(M.mod(two));
        
    }
}
