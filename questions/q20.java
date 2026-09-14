import java.util.*;

public class q20 {
    public static void main(String[] args) {
        String s="eceba";
        int k=2;

        int left=0;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();

        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while(map.size()>k){
                char lchar = s.charAt(left);

                map.put(lchar,map.get(lchar)-1);
                
                if(map.get(lchar)==0){
                    map.remove(lchar);
                }
                left++;
            }

            max=Math.max(max,right-left+1);
        }
        System.out.println(max);
    }
}
