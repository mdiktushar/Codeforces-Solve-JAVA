
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
public class CF_599A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long b = input.nextLong();
        long c = input.nextLong();
        if(a+b <= c)
            System.out.println(a*2 + b*2);
        else{
            if(Math.max(a, b)<c*2)
                System.out.println(a+b+c);
            else
                System.out.println(Math.min(a, b)*2 + c*2);
        }
    }
}
