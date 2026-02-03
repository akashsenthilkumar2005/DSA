class Solution {
    public boolean isAnagram(String s, String t)
     {
        if(s.length()!=t.length()) return false;
        int[] a=new int[256];
        int[] b=new int[256];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)]++;
            b[t.charAt(i)]++;
        }
        for(int i=97;i<=122;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}