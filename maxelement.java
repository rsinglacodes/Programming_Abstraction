class maxelement {
    static int MaxElement(int[] arr){
        int maxe=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxe){
                maxe=arr[i];
            }
        }
        return maxe;

    }

    public static void main(String[] args){
        int[] arr={10,30,120,40,90};
        int ans = MaxElement(arr);
        System.out.print(ans);
        
    }
}
