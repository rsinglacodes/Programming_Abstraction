import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        String s = "madm";

        Deque<Character> dq = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            dq.addFirst(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        while (!dq.isEmpty()) {
            sb.append(dq.removeFirst());
        }

        if(s.equals(sb.toString())){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }

    }
}
