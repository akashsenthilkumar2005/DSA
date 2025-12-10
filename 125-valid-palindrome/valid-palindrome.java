class Solution {
    public boolean isPalindrome(String s) {
         String a=s.replaceAll("[^a-zA-Z0-9]","");
        a=a.toLowerCase();
        int l=0,r=a.length()-1;
        while (l < r) {
            if(a.charAt(l)!=a.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}