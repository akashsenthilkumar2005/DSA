class Solution {
    public boolean isHappy(int n) {
        int s=0;
        while (n!=1&&n!=4){
         s=0;
         while (n!=0){
             int mod=n%10;
             s+=mod*mod;
             n/=10;
         }
         n=s;

        }
        return n==1;
    }
}