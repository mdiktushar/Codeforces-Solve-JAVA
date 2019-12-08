
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
public class CF_520A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str = input.next();
        boolean[] arr = new boolean[26];
        int i=0;
        if(str.contains("a")||str.contains("A"))arr[i++]=true;
        if(str.contains("b")||str.contains("B"))arr[i++]=true;
        if(str.contains("c")||str.contains("C"))arr[i++]=true;
        if(str.contains("d")||str.contains("D"))arr[i++]=true;
        if(str.contains("e")||str.contains("E"))arr[i++]=true;
        if(str.contains("f")||str.contains("F"))arr[i++]=true;
        if(str.contains("g")||str.contains("G"))arr[i++]=true;
        if(str.contains("h")||str.contains("H"))arr[i++]=true;
        if(str.contains("i")||str.contains("I"))arr[i++]=true;
        if(str.contains("j")||str.contains("J"))arr[i++]=true;
        if(str.contains("k")||str.contains("K"))arr[i++]=true;
        if(str.contains("l")||str.contains("L"))arr[i++]=true;
        if(str.contains("m")||str.contains("M"))arr[i++]=true;
        if(str.contains("n")||str.contains("N"))arr[i++]=true;
        if(str.contains("o")||str.contains("O"))arr[i++]=true;
        if(str.contains("p")||str.contains("P"))arr[i++]=true;
        if(str.contains("q")||str.contains("Q"))arr[i++]=true;
        if(str.contains("r")||str.contains("R"))arr[i++]=true;
        if(str.contains("s")||str.contains("S"))arr[i++]=true;
        if(str.contains("t")||str.contains("T"))arr[i++]=true;
        if(str.contains("u")||str.contains("U"))arr[i++]=true;
        if(str.contains("v")||str.contains("V"))arr[i++]=true;
        if(str.contains("w")||str.contains("W"))arr[i++]=true;
        if(str.contains("x")||str.contains("X"))arr[i++]=true;
        if(str.contains("y")||str.contains("Y"))arr[i++]=true;
        if(str.contains("z")||str.contains("Z"))arr[i++]=true;
        
        for(int j=0; j<26; j++){
            if(arr[j]==false){
                System.out.println("NO");
                return;
            }
        }System.out.println("YES");
    }
}
