public class quicksort {
    static void quick(int[] arr, int low,int high){
        if(low<high){
            int i_pivot=partition(arr, low, high);
            quick(arr, low, i_pivot-1);
            quick(arr, i_pivot+1, high);
        }
    }
    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;

    }
    public static void main(String[] args){
        int[] arr={7,2,9,1,5,8,3};
        quick(arr, 0, arr.length-1);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
