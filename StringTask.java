import java.util.*;

public class StringTask{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String upS = str.toLowerCase();
        for(int i=0;i<upS.length();i++){
            if(upS.charAt(i) != 'a' && upS.charAt(i) != 'e'&& upS.charAt(i) != 'i'&&upS.charAt(i) != 'o'&&upS.charAt(i) != 'u'&&upS.charAt(i) != 'y'){
                System.out.print(".");
                System.out.print(upS.charAt(i));
            }
        }
    }
}