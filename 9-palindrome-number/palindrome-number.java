class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        else if(x==0) return true;
        else{
            int t=x;
            int s=0;
            while(x!=0){
                int mod=x%10;
                s=s*10+mod;
                x/=10;
            }
            if(t==s){
                    return true;
            }
            return false;
        }
    }
}