
import java.util.Scanner;


public class CF_271A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        for(int I=++year; ; I++){
            int[] arr = new int[4];
            int y = I;
            for(int i=0; i<4; i++){
                arr[i] = y%10;
                y = y/10;
            }
            if(arr[0]!=arr[1]&&arr[0]!=arr[2]&&arr[0]!=arr[3]&&
                    arr[1]!=arr[0]&&arr[1]!=arr[2]&&arr[1]!=arr[3]&&
                    arr[2]!=arr[0]&&arr[2]!=arr[1]&&arr[2]!=arr[3]&&
                    arr[3]!=arr[0]&&arr[3]!=arr[1]&&arr[3]!=arr[2]){
                System.out.println(I);break;
            }
        }
    }
}
