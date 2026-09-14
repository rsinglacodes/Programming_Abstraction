import java.util.*;

public class q8 {
    public static void main(String[] args) {
        int arr[]={1,0,1,2};
        int n= arr.length;

        Arrays.sort(arr);
        int max=1;
        int c=1;
        for(int right=1;right<n;right++){
            if(arr[right-1]+1==arr[right]){
                c++;
            }
            else{
                c=1;
            }

            max=Math.max(max,c);
        }

        System.out.println(max);

    }
}
