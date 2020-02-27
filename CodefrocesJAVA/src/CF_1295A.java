
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
public class CF_1295A {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int T = input.nextInt();
        for(int I=0; I<T; I++){
            int n = input.nextInt();
            if(n%2 == 0){
                n = n/2;
                for(int i=0; i<n; i++)
                    System.out.print(1);
            }else{
                
                n = n/2;
                n--;
                System.out.print(7);
                for(int i=0; i<n; i++)
                    System.out.print(1);
            }System.out.println("");
        }
    }
}
