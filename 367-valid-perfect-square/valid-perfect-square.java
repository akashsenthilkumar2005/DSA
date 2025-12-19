class Solution {
    public boolean isPerfectSquare(int num) {
        double n=Math.pow(num,0.5);
        if((int)n*(int)n==num) return true;
        return false;
    }
}