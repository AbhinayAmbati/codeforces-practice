import java.util.*;

public class WordCapitalization {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        for(int i=0;i<str.length();i++){
            if(i == 0 && (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')){
                System.out.print((char)(str.charAt(i)-32));
            }
            else{
                System.out.print(str.charAt(i));
            }
        }
    }
    
}
