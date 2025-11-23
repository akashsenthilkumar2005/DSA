class Solution {
    public int pivotInteger(int n) {
        if(n==1) return 1;
        int a=(n*(n+1))/2;
        for(int i=2;i<=n;i++){
            int c=(i*(i+1))/2;
            if(c==(a-c+i)){
                return i;
            }
        }
        return -1;
    }
}