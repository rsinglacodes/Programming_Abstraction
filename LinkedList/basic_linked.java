import java.util.*;

public class basic_linked{
    public static void main(String[] args) {
        // ArrayList<Object> arr = new ArrayList<>();
        // arr.add(1);
        // arr.add(2);
        // arr.add("Java");
        // System.out.println(arr);

        LinkedList<Object> ls = new LinkedList<>();
        ls.addFirst(12);
        ls.add("java");
        System.out.println(ls);
        ls.addLast(23);
        System.out.println(ls);
        
    }
}
