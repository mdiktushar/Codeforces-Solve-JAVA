
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
public class CF_492A {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int n = input.nextInt();
        int N = 1;
        
        while(true){
            int sum = 0;
            for (int i=1; i<=N; i++)
                sum += i;
            if(n>=sum){
                n -= sum;
                sum = 0;
                N++;
            }else{
                System.out.println(--N);
                return;
            }
        }
    }
}
