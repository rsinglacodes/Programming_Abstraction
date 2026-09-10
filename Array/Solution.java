class Solution {
    public boolean isV(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public int maxVowels(String s, int k) {
        int vcount=0;
        for(int i=0;i<k;i++)
        if(isV(s.charAt(i))){
            vcount++;
        }
        int maxv=vcount;
        for(int i=k;i<s.length();i++){
            if(isV(s.charAt(i-k))){
                vcount--;
            }
            if(isV(s.charAt(i))){
                vcount++;
            }
            maxv=Math.max(maxv,vcount);
        }
        return maxv;
    }
}