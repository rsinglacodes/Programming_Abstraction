import java.util.HashMap;

public class q17 {
    public static void main(String[] args) {
        String s="listen";
        String t="silent";

        if(s.length()!=t.length()){
            System.out.println(false);
            return;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean found=true;

        // HashMap<Character,Integer> map2 = new HashMap<>();

        // for(char ch:t.toCharArray()){
        //     map2.put(ch,map2.getOrDefault(ch,0)+1);
        // }

        // for(char ch:s.toCharArray()){
        //     if(map.get(ch) != map2.get(ch)){
        //         found=false;
        //         break;
        //     }
        // }

        for(char ch:t.toCharArray()){
            map.put(ch,map.get(ch)-1);
        }

        for(int count:map.values()){
            if(count!=0){
                found=false;
            }
        }

        System.out.println(found);

    }
}
