
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
public class CF_893B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        for(int i=1; ;i++){
            int temp = ((int)Math.pow(2, i)-1)*((int)Math.pow(2, i-1));
            if(temp==n){
                System.out.println(n);
                return;
            }
            if(temp>n)
                break;
        }
        
        int N = n/2;
        int ans=0;int k=1;
        for(int i=1; i<=N; i=(int)(Math.pow(2, k)-1)*(int)(Math.pow(2, k-1))){
            if(n%i==0)
                ans=i;
            k++;
        }
        System.out.println(ans);
    }
}
