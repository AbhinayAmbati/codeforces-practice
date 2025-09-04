import java.util.Scanner;

public class PetyaAndStrings{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int len = s1.length();

        int one = 0;

        for(int i=0;i<len;i++){
            if(s1.equals(s2)) {
                break;
            }
            if(s1.charAt(i) > s2.charAt(i)){
                one = 1;
                break;
            }
            if(s2.charAt(i) > s1.charAt(i)){
                one = -1;
                break;
            }
        }
        System.out.println(one);
    }
}