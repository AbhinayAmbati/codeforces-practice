import java.util.Scanner;

public class SoldierandBananas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int n = s.nextInt();
        int w = s.nextInt();
        int cost = 0;
        for(int i=1;i<=w;i++){
            cost = cost + i * k;
        }
        if(n > cost) System.out.println("0");
        else System.out.println(cost-n);
    }
}
