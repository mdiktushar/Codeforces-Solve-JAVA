 
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author MDTus
 */
public class CF_903B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h1=input.nextInt();
        int a1=input.nextInt();
        int c1=input.nextInt();
        int h2=input.nextInt();
        int a2=input.nextInt();
        Vector v = new Vector();

        while(h2>0)
        {
            if(h1-a2<=0 && h2-a1>0){
                v.add("HEAL");
                h1+=c1;
                h1-=a2;
            }else{
                v.add("STRIKE");
                h2-=a1;
                h1-=a2;
            }
        }
        System.out.println(v.size());
        Iterator it = v.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}