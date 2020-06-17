
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
public class CF_884A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int p=input.nextInt();
        int ans=0;
        while(n>0){
            int d=input.nextInt();
            p-=(86400-d);
            ans++;
            if(p<=0){
                System.out.println(ans);return;
            }
            n--;
        }
    }
}
