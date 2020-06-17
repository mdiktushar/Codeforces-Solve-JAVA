
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
public class CF_900A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int p=0,m=0;
        while(t!=0){
            int a=input.nextInt();
            int b=input.nextInt();
            if(a>0)p++;
            else if(a<0)m++;
            t--;
        }
        //System.out.println(p+" "+m);
        if(p==0||m==0||p==1||m==1)
            System.out.println("YES");
        else System.out.println("NO");
    }
}
