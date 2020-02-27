
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MDTus
 */
public class CF_1296A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for(int I=0; I<t; I++){
            int Od = 0, Ev = 0;
            int n = input.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for(int i=0; i<n; i++){
                arr[i] = input.nextInt();
                sum += arr[i];
                
                if(arr[i] % 2 == 0)
                    Ev++;
                else Od++;
            }
            if(sum % 2 != 0 || (Ev != 0 && Od != 0))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
