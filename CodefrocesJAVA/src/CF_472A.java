
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
public class CF_472A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        if(n%2==0){
            System.out.print(8);
            n = n-8;
            System.out.println(" "+n);
        }
        else{
            System.out.print(9);
            n = n-9;
            System.out.println(" "+n);
        }
    }
}
