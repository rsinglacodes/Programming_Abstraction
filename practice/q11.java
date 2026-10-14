// palindrome

public class q11 {
     public static void main(String[] args) {
        int n=12231;
        int rev=0;
        int x=n;
        while(x>0){
            int d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
        if(n!=rev){
            System.out.print("no");
            
        }
        else{
            System.out.print("Yes");
        }

    }
}
