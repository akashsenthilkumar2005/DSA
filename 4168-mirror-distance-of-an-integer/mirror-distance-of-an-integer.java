class Solution {
    public int mirrorDistance(int n) {
        int t=n,s=0;
        while(t!=0){
            int mod=t%10;
             s=s*10+mod;
            t/=10;
        }
        return (Math.abs(n-s));
    }
}