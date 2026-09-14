public class q14 {
    public static void main(String[] args) {
        String s="Madam";
        s=s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        boolean found=true;
        while(left<=right){
            while(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            while(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            if(left>right) break;
            if(s.charAt(left)!=s.charAt(right)){
                found=false;
                break;
            }
            left++;
            right--;

        }
        System.out.println(found);
    }
}
