
import java.util.Scanner;

public class WrongSubtraction {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();

        for(int i=0;i<k;i++){
            int res = n%10;
            if(res != 0){
                n = n-1;
            }else{
                n = n/10;
            }
        }
        System.out.println(n);
    }
    
}
