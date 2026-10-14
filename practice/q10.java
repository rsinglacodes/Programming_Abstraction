// move zeroes to end 

public class q10 {
    public static void main(String[] args) {
        int arr[] = {1,0,2,0,3,4};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j++]=arr[i];
            }
        }
        while(j!=arr.length){
            arr[j++]=0;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }       
    }
}
