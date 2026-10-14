// reverse a digit 

import java.util.*;
class q6 {
    public static void main(String[] args) {
        int n=12234445;
        int rev=0;
        while(n>0){
            int f=n%10;
            rev=rev*10+f;
            n=n/10;
        }
              
        System.out.print(rev);
    }
}