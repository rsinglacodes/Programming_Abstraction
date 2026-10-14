//  remove spaces 

public class q8 {
     public static void main(String[] args) {
        String s="My namesss is neeraj";
        StringBuilder sb = new StringBuilder();
        for(String word:s.split(" ")){
            sb.append(word);
        }
        System.out.print(sb.toString());
    }
}
