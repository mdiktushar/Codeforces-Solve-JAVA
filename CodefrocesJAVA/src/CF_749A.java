
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
public class CF_749A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n%2 == 0){
            n = n/2;
            System.out.println(n);
            while(n!=0){
                System.out.print(2+" ");
                n--;
            }
        }else{
            n = n/2;
            System.out.println(n--);
            System.out.print(3+" ");
            while(n!=0){
                System.out.print(2+" ");
                n--;
            }
        }
        System.out.println("");
    }
}
