import java.util.*;

public class basic {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(101,"Ridhi Singla");
        map.put(102,"Senona");
        map.put(10,"Rishita");

        System.out.println(map);

        // hashcode() --> internally calculated 
        // 1. key ka hashcode calculate karega
        // 2. using that it calculates bucket index 
        // 3. then stores key values accordingly 

        // formula: index=(n-1) &hash
        // n=capacity of hashmap (default capacity is 16)

        //  key = 0 i.e hash = 0 ; bucket index=0;
        // key = 1 i.e hash = 1 ; bucket index=1;
        // key = 10 i.e hash = 10 ; bucket index=10;
        // key = 100 i.e hash = 100 ; bucket index=4(100 %16);
        // key = 101 i.e hash = 101 ; bucket index=5;

        // treemap --> sorted order 
        // linked map -> insertion order followed
    }

}
