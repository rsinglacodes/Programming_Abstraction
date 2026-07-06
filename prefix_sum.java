
class Main {
    public static void main(String[] args) {
        int[] arr={2,5,3,8,1,6};
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        int l=5;
        int s=2;
        int r;
        if(s==0){
            r = prefix[l];
        }
        else{
            r = prefix[l]-prefix[s-1];
        }
        System.out.println(r);
        for(int x:prefix){
            System.out.print(x +" ");
        }
    }
}
