
import java.util.Arrays;
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
public class CF_1064A {
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0; i<3; i++){
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        int flag=0;
        while(arr[2] > (arr[1]+arr[0]-1)){
            arr[1]++;
            flag++;
        }
        System.out.println(flag);
    }
}
