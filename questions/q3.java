public class q3 {
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        int n=arr.length;

        // int nums[] = new int[n];
        // int a=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]!=0){
        //         nums[a++]=arr[i];
        //     }
        // }

        // for(int i=0;i<n;i++){
        //     System.out.println(nums[i]);
        // }

        int left = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
}
