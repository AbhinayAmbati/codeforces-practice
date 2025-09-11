import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();  
        long k = s.nextLong();
        
        long oddCount = (n + 1) / 2; 
        
        if (k <= oddCount) {
            System.out.println(2 * k - 1);
        } else {
            System.out.println(2 * (k - oddCount));
        }
    }
}
