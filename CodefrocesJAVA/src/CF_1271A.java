
import java.util.Arrays;
import java.util.Scanner;

public class CF_1271A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();int b = input.nextInt();
        int c = input.nextInt();int d = input.nextInt();
        int e = input.nextInt();int f = input.nextInt();
        int res = 0;
        if(e>f){
            if(d>=a){
                d -= a;
                res = a*e;
                if(d == 0){System.out.println(res);return;}
                int[] arr = {b,c,d};
                Arrays.sort(arr);
                res += arr[0]*f;
                System.out.println(res);return;
            }else{
                System.out.println(e*d);return;
            }
        }else{
            int[] arr = {b,c,d};
            Arrays.sort(arr);
            d -= arr[0];
            if(d==0){System.out.println(f*arr[0]);return;}
            res = arr[0]*f;
            int arr1[] = {d,a};Arrays.sort(arr1);
            res += arr1[0]*e;
            System.out.println(res);return;
        }
    }
}
