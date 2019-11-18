import java.util.Arrays;
import java.util.Scanner;

public class CF_1243A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        for(int i=0; i<n; i++){
            int N = input.nextInt();
            int[] num = new int[N];
            for(int j=0; j<N; j++){
                num[j] = input.nextInt();
            }
            Arrays.sort(num);
            for(int j=num[N-1]; j>=1; j--){
                int count =1;
                for(int k=N-2; k>=0; k--){
                    if(num[k]>=j)count++;
                    else break;
                }
                if(count>=j){System.out.println(j);break;}
            }
        }
    }
}
