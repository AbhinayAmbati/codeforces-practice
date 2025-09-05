import java.util.*;

public class HelpfulMaths{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int len = str.length();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<len;i++){
            if(str.charAt(i) != '+'){
                int n = Integer.parseInt(String.valueOf(str.charAt(i)));
                al.add(n);
            }
        }
        Collections.sort(al);
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i));
            if(i != al.size()-1){
                System.out.print("+");
            }
        }
    }
}