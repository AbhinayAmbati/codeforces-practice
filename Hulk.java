
import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.print("I hate ");
            }else{
                System.out.print("I love ");
            }
            if(i==n){
                System.out.print("it");
            }else{
                System.out.print("that ");
            }
        }
    }
}
