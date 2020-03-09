
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
public class CF_1183A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CF_1183A ob = new CF_1183A();
        int n = input.nextInt();
        while(ob.sum(n)%4 != 0){
            n++;
        }
        System.out.println(n);
    }
    int sum(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
