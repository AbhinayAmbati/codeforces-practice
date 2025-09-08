import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int luckyCount = 0;

        while(n > 0){
            long digit = n % 10;
            if(digit == 4 || digit == 7){
                luckyCount++;
            }
            n /= 10;
        }

        if(luckyCount == 4 || luckyCount == 7){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
