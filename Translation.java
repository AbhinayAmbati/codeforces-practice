import java.util.Scanner;

public class Translation{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.next();
        String ts = s.next();
        StringBuilder sb = new StringBuilder(ts);
        sb.reverse();
        String t = sb.toString();
        if(st.equals(t)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}