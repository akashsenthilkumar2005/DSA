class Solution {
    public boolean checkDivisibility(int n) {
        int p=1,s=0;
        int t=n;
        while(t!=0){
            int mod=t%10;
            p*=mod;
            s+=mod;
            t/=10;
        }
        if(n%(s+p)==0) return true;
        return false;
    }
}