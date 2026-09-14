public class q9 {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target = 9;
        int n=arr.length;
        
        int left=0;
        int right=n-1;
        while(left<=right){
            int sum=arr[left]+arr[right];

            if(sum == target){
                System.out.println(left+ " "+right);
                break;
            }

            else if(sum>target){
                right--;
            }
            else{
                left++;
            }
        }
        
    }
}
