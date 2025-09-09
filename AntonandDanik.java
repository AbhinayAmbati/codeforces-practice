import java.util.*;

public class AntonandDanik {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'A'){
                x++;
            }else{
                y++;
            }
        }
        if(x > y){
            System.out.println("Anton");
        }
        if(y > x){
            System.out.println("Danik");
        }
        if(x == y){
            System.out.println("Friendship");
        }
    }
}
