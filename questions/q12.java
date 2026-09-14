public class q12 {
    public static void main(String[] args) {
        int arr[] = {1,1,1};
        int k = 2;

        int n=arr.length;
        int sum=0;
        int c=0;
        int left=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            while(sum>=k){
                c=i-left+1;
                sum-=arr[left];
                left++;
                
            }
        }
        System.out.println(c);
    }
}
