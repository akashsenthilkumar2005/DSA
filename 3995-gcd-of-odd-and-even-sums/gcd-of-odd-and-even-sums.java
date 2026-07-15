class Solution {
    public int gcdOfOddEvenSums(int n) {
         int odd=n*n,even=(n*(n+1));
        int gcd=findgcd(odd,even);
        return gcd;
    }
     public int findgcd(int a,int b){
        if(b==0) return a;
        return findgcd(b,a%b);
    }
}