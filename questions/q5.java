public class q5 {
    public static void main(String[] args) {
        int arr[] = {3,0,1};
        int n=arr.length;

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }     
        int a=n*(n+1);
        
        System.out.println(a/2-sum);
    }
}
