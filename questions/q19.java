import java.util.*;

public class q19 {
    public static void main(String[] args) {
        String s="abcabcbb";
        int left=0;
        
        HashSet<Character> set=new HashSet<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            max=Math.max(max,i-left+1);
        }

        System.out.println(max);
    }
}
