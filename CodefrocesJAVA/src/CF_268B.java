
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
public class CF_268B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long sum = 0;
        for(int i=1; i<n; i++)
            sum+=(n-i)*i;
        sum+=n;
        System.out.println(sum);
    }
}
