// second largest 

public class q9 {
    public static void main(String[] args) {
        int[] arr={-11,7,0,9,16,52};
        int max=arr[0];
        int smax=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i] >=smax && arr[i]!=max){
                smax=arr[i];
            }
        }

        System.out.println(smax);
    }
}
