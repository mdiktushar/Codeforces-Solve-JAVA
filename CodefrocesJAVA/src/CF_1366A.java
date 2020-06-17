
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
public class CF_1366A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t!=0){
            long a=input.nextLong();
            long b=input.nextLong();
            if(a>0&&b>0){
                if((a+b)/3>=Math.min(a, b))
                    System.out.println(Math.min(a, b));
                else System.out.println((a+b)/3);
            }
            else
                System.out.println(0);
            t--;
        }
    }
}
