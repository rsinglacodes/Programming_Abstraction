class occurence_count {

    static int Foccurence(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=0;

        while(low<=high){
            int mid=(high-low)/2;

            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

    static int Loccurence(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=0;

        while(low<=high){
            int mid=(high-low)/2;

            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr={1,2,2,2,3,4,5};
        int target=2;
        int first=Foccurence(arr, target);
        int last = Loccurence(arr, target);
        System.out.print("First: "+first);
        System.out.print("Last: "+last);
        System.out.print("Count: "+(last-first+1));
    }
    
}
