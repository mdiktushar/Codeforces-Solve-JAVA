
import java.util.Scanner;


public class CF_148A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] v = new int[4];
        for(int i=0; i<4; i++)v[i] = input.nextInt();
        int n = input.nextInt();
        if(v[0]==1||v[1]==1||v[2]==1||v[3]==1){
           System.out.println(n);return;
        }
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=0;
        }
        for(int i=0; i<n; i++){
            if((i+1)%v[0]==0){arr[i] = 1;}
            else if((i+1)%v[1]==0){arr[i] = 1;}
            else if((i+1)%v[2]==0){arr[i] = 1;}
            else if((i+1)%v[3]==0){arr[i] = 1;}
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 1)sum += 1;
        }System.out.println(sum);
    }
}
