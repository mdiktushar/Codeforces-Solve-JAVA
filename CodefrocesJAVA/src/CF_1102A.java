
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
public class CF_1102A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        BigInteger n = new BigInteger(s);
        BigInteger n1 = new BigInteger("1");
        n1 = n.add(n1);
        n = n.multiply(n1);
        n = n.divide(new BigInteger("2"));
        
        if(n.mod(new BigInteger("2")).equals(BigInteger.ZERO))
            System.out.println("0");
        else
            System.out.println("1");
        
    }
}
