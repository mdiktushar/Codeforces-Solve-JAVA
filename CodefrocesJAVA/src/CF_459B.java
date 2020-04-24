
import java.math.BigInteger;
import static java.util.Arrays.sort;
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
public class CF_459B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n; i++)
            arr[i] = input.nextLong();
        sort(arr);
        long max = arr[n-1];
        long min = arr[0];
        
        long maxc=0,minc=0;
        for(int i=0; i<n; i++){
            if(arr[i]==min)
                minc++;
        }
        for(int i=0; i<n; i++){
            if(arr[i]==max)
                maxc++;
        }
        if(min!=max){
            System.out.println(max-min+" "+minc*maxc);
        }
        else{
            String s = String.valueOf(n-1);
            BigInteger b = new BigInteger(s);
            BigInteger t = b.add(new BigInteger("1"));
            b = b.multiply(t);
            b = b.divide(new BigInteger("2"));
            System.out.println(max-min+" "+b);
        }
    }
}
