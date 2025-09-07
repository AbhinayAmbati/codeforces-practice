import java.util.*;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int k = sc.nextInt();
            long x = sc.nextInt();

            for (int i = 0; i < k; i++) {
                if (i == k - 1 && (x - 1) % 3 == 0) {
                    long cand = (x - 1) / 3;
                    if (cand > 0 && cand % 2 == 1) {
                        x = cand;
                        continue;
                    }
                }
                x = x * 2;
            }

            System.out.println(x);
        }
    }
}
