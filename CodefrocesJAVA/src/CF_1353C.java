
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
public class CF_1353C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0; i<t; i++){
            String s = input.next();
            BigInteger n = new BigInteger(s);
            n = n.divide(new BigInteger("2"));
            BigInteger n1 = n.add(new BigInteger("1"));
            n1 = n.multiply(n1);
            //System.out.println(n1);
            
            n = n.multiply(new BigInteger("2"));
            //System.out.println(n);
            n = n.add(new BigInteger("1"));
            //System.out.println(n);
            
            n = n.multiply(n1);
           //System.out.println(n);
            n = n.divide(new BigInteger("6"));
            //System.out.println(n);
            n = n.multiply(new BigInteger("8"));
            System.out.println(n);
            
        }
    }
}
