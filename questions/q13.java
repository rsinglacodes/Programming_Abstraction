public class q13 {
    public static void main(String[] args) {
        String s="hello";
        // String ans="";
        // char ch[] = s.toCharArray();
        // for(int i=s.length()-1;i>=0;i--){
        //     ans+=ch[i];
        // }

        // System.out.println(ans);

        StringBuilder sb = new StringBuilder();

        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }

        System.out.println(sb.toString());
    }
}
