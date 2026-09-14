import java.util.HashMap;

public class q6 {
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};
        int n=arr.length;

        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int i=0;i<n;i++){
        //     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        // }
        
        // for(int i=0;i<n;i++){
        //     if(map.get(arr[i])==1){
        //         System.out.println(arr[i]);
        //     }
        // }
        int ans=0;
        for(int i=0;i<n;i++){
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
    }
}
