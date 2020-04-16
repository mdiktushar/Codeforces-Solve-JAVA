
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
public class CF_1077A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int I=0; I<t; I++){
            long a,b,k;
            a = input.nextLong();
            b = input.nextLong();
            k = input.nextLong();
            if(k%2==0){
                System.out.println((a-b)*(k/2));
            }
            else{
                System.out.println((a-b)*(k/2)+a);
            }
        }
    }
}
