import java.util.*;

public class q15 {
    public static void main(String[] args) {
        String s="banana";
        s=s.toLowerCase();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        
    }
}
