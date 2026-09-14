import java.util.HashMap;

public class q16 {
    public static void main(String[] args) {
        String s="leetcode";
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int ans=-1;
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i)) == 1){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}
