
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
public class CF_1281A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0; i<n; i++){
            String s = input.next();
            int N = s.length();
            switch (s.charAt(N-1)) {
                case 'o':
                    System.out.println("FILIPINO");
                    break;
                case 'u':
                    System.out.println("JAPANESE");
                    break;
                default:
                    System.out.println("KOREAN");
                    break;
            }
        }
    }
}
