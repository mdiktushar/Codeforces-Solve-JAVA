
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
public class CF_1114A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,z;
        int a,b,c;
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        if(a>=x){
            a-=x;
        }
        else{
            System.out.println("NO");
            return;
        }
        b+=a;
        if(b>=y){
            b-=y;
        }else{
            System.out.println("NO");
            return;
        }
        if(b+c>=z){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
