
import java.util.Arrays;
import java.util.Scanner;


public class CF_479A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];
        int[] n = new int[3];
        for(int i=0; i<3; i++)n[i] = input.nextInt();
        arr[0] = n[0]+n[1]*n[2];
        arr[1] = n[0]*(n[1]+n[2]);
        arr[2] = n[0]*n[1]*n[2];
        arr[3] = (n[0]+n[1])*n[2];
        arr[4] = n[0]+n[1]+n[2];
        arr[5] = n[0]*n[1]+n[2];
        Arrays.sort(arr);
        System.out.println(arr[5]);
    }
}
