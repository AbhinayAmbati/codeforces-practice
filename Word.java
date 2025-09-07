import java.util.*;

public class Word {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int upperCase = 0, lowerCase = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                upperCase++;
            }
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                lowerCase++;
            }
        }
        if(upperCase > lowerCase){
            System.out.println(str.toUpperCase());
        }
        if(lowerCase > upperCase || upperCase == lowerCase){
            System.out.println(str.toLowerCase());
        }
    }
    
}
