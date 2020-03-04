
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
public class CF_1311A {
    
    boolean num(int n){
        return n%2 == 0;
    }
    public static void main(String[] args) {
        CF_1311A ob = new CF_1311A();   
        Scanner input = new Scanner (System.in);
        int t = input.nextInt();
        
        while(t!=0){
            int a = input.nextInt();
            int b = input.nextInt();
            if(a == b)System.out.println(0);
            else if(a>b){
                if(ob.num(a-b)==true)
                    System.out.println(1);
                else System.out.println(2);
            }
            else{
                if(ob.num(a-b) == false)
                    System.out.println(1);
                else System.out.println(2);
            }
                                 
            t--;
        }
        
    }
}
