// longest word in sentence

public class q7 {
    public static void main(String[] args) {
        String s="My namesss is neeraj";
        String res="";
        int max=0;
        for(String word:s.split(" ")){
            int n=word.length();
            if(n>=max){
                max=n;
                res=word;
            }
        }
        System.out.print(res);
    }
}
