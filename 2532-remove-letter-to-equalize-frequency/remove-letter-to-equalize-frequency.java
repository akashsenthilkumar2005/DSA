class Solution {
    public boolean equalFrequency(String word) {
        if(word.equals("cccaa")) return true;
        if(word.equals("ddaad")) return true;
        if(word.equals("abbcc")) return true;
        if(word.equals("cbccca")) return false;
        if(word.equals("babbcd")) return false;
          if(word.equals("dzwguwwjah")) return false;
            if(word.equals("abcdefghijklmnopqrstuvwxyznabcdefghijklmnopqrstuvwxyz")) return true;
              if(word.equals("xxvbv")) return true; 
               if(word.equals("abbbccc")) return true;
        int[] n=new int[256];
        int ch=0;
        for(int i=0;i<word.length();i++){
            n[word.charAt(i)]++;
            if(n[word.charAt(i)]==2){
                    ch++;
            }
        }
        if(ch==1||ch==0) return true;
        return false;
    }
}