class Solution {
    public int digitFrequencyScore(int n) {
        int[] a=new int[10];
        while(n!=0){
            int t=n%10;
            a[t]++;
            n/=10;
        }
        int s=0;
        for(int i=0;i<10;i++){
            s+=(i*a[i]);
        }
        return s;
    }
}