
import java.util.Scanner;

public class CF_617A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int count = 0;
                
        for(int i=0; ;i++){
            if(x-5>-1){
                x = x-5;count++;
            }else if(x-4>-1){
                x = x-4;count++;
            }else if(x-3>-1){
                x = x-3;count++;
            }else if(x-2>-1){
                x = x-2;count++;
            }else if(x-1>-1){
                x = x-1;count++;
            }else{
                System.out.println(count);break;
            }
        }
    }
}
