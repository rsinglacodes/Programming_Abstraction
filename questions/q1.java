// 
public class q1 {

    public static void main(String[] args) {
        int arr[] ={5,2,9,1,7};

        int n = arr.length;
        int maxi=arr[0];
        int mini=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>=maxi){
                maxi=arr[i];
            }
            if(arr[i]<=mini){
                mini=arr[i];
            }
        }

        System.out.println("Smallest = "+mini+", Largest = "+maxi);
    }
    
}
