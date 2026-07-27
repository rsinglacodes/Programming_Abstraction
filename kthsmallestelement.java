import java.util.Arrays;

class kthsmallestelement{
    public static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }

            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

    public static void main(String[] args){
        int[] arr={5,3,8,4,2};
        int k=3;
        selection(arr);
        System.out.println("Sorted Array:"+Arrays.toString(arr));
         System.out.println(k+"rd smallest element:"+arr[k-1]);
    }
}
