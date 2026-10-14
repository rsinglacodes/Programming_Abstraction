// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class q3 {
    public static void main(String[] args) {
        String s = "adcefgh";
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            char ch = chars[i];
            if(i%2==0){
                chars[i] = Character.toUpperCase(ch);
            }
            else{
                chars[i] = Character.toLowerCase(ch);
            }
        }
        System.out.println(new String(chars));
    }
}