import java.util.HashSet;

public class q4 {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3};
        int n=arr.length;

        // HashSet<Integer> set=new HashSet<>();
        
        // for(int i=0;i<n;i++){
        //     set.add(arr[i]);
        // }

        // System.out.println(set.size());

        int left=0;

        for(int right=1;right<n;right++){
            if(arr[right]!=arr[left]){
                left++;
                arr[left]=arr[right];
            }
        }

        for(int i=0;i<=left;i++){
            System.out.println(arr[i]);
        }
    }
}
