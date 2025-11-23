class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        else if(x==0) return true;
        else{
           String s=String.valueOf(x);
           char[] st=s.toCharArray();
            int n=st.length-1;
            for(int i=0;i<(st.length)/2;i++){
                    if(st[n]==st[i]) n--;
                    else return false;
            }
            return true;
        }
    }
}