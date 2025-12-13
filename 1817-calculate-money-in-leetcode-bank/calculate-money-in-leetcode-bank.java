class Solution {
    public int totalMoney(int n) {
        if(n<=7) return (n*(n+1))/2;
        int w=n/7,r=n%7,tot=0;
        int full = 28 * w + (7 * w * (w - 1)) / 2;
        int rem = r * (2 * (w + 1) + (r - 1)) / 2;
        tot=full+rem;
        return tot;
    }
}