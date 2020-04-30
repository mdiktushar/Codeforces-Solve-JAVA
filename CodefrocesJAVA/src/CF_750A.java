
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
public class CF_750A {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int t = (4*60)-k;
        int sum = 0;int i;
        for(i=1; i<=n; i++){
            sum+=i*5;
            if(sum>t){
                break;
            }
        }
        System.out.println(--i);
    }
}
