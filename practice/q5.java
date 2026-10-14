//  n=123343 ---> remove duplicates

import java.util.*;
class q5 {
    public static void main(String[] args) {
        int n=12234445;
        HashSet<Integer> set=new HashSet<>();
        while(n>0){
            int f=n%10;
            set.add(f);
            n=n/10;
        }
        int res=0;
        for(int x:set){
            res=res*10+x;
        }        
        System.out.print(res);
    }
}
