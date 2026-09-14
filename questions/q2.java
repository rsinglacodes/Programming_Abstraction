public class q2 {
    public static void main(String[] args) {
        int arr[] = {10,5,8,10,3};

        int ma=arr[0];
        int sma=Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>ma){
                sma=ma;
                ma=arr[i];
            }
            else if(arr[i]>sma && arr[i]!=ma){
                sma=arr[i];
            }
        }

        System.out.println("Second maxiimum "+sma);
    }
}
