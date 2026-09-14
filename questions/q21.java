import java.util.*;

public class q21 {
    public static void main(String[] args) {
        String s="aabacbebebe";
        int k=3;

        int left=0;
        int max=0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);

            map.put(ch,map.getOrDefault(ch, 0)+1);

            while(map.size()>k){
                char lchar=s.charAt(left);

                map.put(lchar,map.get(lchar)-1);

                if(map.get(lchar)==0){
                    map.remove(lchar);
                }

                left++;
            }

            max=Math.max(max,i-left+1);

        }
        System.out.println(max);
    }
}
