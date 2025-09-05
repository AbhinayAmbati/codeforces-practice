import java.util.*;

public class BearandBigBrother{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int count = 0;
        while(a <= b){
            a = a*3;
            b = b*2;
            count++;
        }
        System.out.println(count);
    }
}