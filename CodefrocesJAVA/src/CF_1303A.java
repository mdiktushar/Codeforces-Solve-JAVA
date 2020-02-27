
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
public class CF_1303A {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int t = input.nextInt();
        for(int i=0; i<t; i++){
            String s = input.next();
            
            int sum =0, f = 0, f1 = 0;
            char[] ch = s.toCharArray();
            int n = ch.length;
            for(int j=0; j<n; j++){
                if(ch[j] == '1')
                    f = 1;
                
                if(f != 0 && ch[j] == '0')
                    f1++;
                
                if(f1 != 0 && ch[j] == '1'){
                    sum += f1; f1 = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
