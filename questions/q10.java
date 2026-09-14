import java.util.HashMap;

public class q10 {
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        int n=arr.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        int max=n/2;
        int ans=-1;
        for(int i=0;i<n;i++){
            if(map.get(arr[i]) > max){
                ans=arr[i];
            }
        }

        System.out.println(ans);
    }
}
