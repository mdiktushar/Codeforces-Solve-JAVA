
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
public class CF_1091A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long y = input.nextLong();
        long b = input.nextLong();
        long r = input.nextLong();
        if(y+1 == b && b+1 == r)
            System.out.println(y*3+3);
        else{
            long res = Math.min(y+2, Math.min(b+1,r))*3 -3;
            System.out.println(res);
        }
    }
}
