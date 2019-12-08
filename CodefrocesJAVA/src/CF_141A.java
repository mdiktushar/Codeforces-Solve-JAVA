
import java.util.Arrays;
import java.util.Scanner;

public class CF_141A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S1,S2,S3;
        S1 = input.next();
        S2 = input.next();
        S3 = input.next();
        S1 = S1+S2;

        char[] ch1,ch2;
        ch1 = S1.toCharArray();
        ch2 = S3.toCharArray();
        
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int n1 = S1.length();
        int n2 = S3.length();
        
        int p = 65;
        int t = 0;
        for(int i=0; i<n1; i++){
            if(ch1[i] == p){arr1[t] += 1;}
            else{
                i--;
                p++;
                t++;
            }
        }
        p = 65;
        t = 0;
        for(int i=0; i<n2; i++){
            if(ch2[i] == p){arr2[t] += 1;}
            else{
                i--;
                p++;
                t++;
            }
        }
        for(int i=0; i<26; i++){
            if(arr1[i]!=arr2[i]){
                System.out.println("NO");
                return;
            }
        }System.out.println("YES");
    }
}
