
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
public class CF_1326A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        while(t!=0){
            
            int n = input.nextInt();
            if(n==1)System.out.println(-1);
            else{
                System.out.print(2);
                n--;
                while(n!=0){
                    System.out.print(7);
                    n--;
                }System.out.println();
            }
            t--;
        }
    }
}
