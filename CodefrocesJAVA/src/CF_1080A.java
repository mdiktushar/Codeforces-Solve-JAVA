
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
public class CF_1080A {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        CF_1080A ob = new CF_1080A();
        long n = input.nextLong();
        long k = input.nextLong();
        
        long red = n*2;
        long green = n*5;
        long blue = n*8;
        long sum = ob.coutn(red, k);
        sum += ob.coutn(green, k);
        sum += ob.coutn(blue, k);
        System.out.println(sum);
    }
    long coutn(long col, long pap){
        long r = col/pap;
        if(col%pap != 0)
            return ++r;
        else return r;
    }
}
