class binarysearch {
    static int bs(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={10,30,20,40,90};
        int target = 30;
        int ans = bs(arr, target);
        if(ans==-1){
            System.out.print("Element not found");
        }
        else{
            System.out.print(ans);
        }
        
    }
}
