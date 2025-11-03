class Solution {
    public boolean checkStraightLine(int[][] a) {
         int x0=a[0][0],y0=a[0][1];
        int x1=a[1][0],y1=a[1][1];
        for (int i=2;i<a.length;i++){
            if((y1-y0)*(a[i][0]-x0)!=(a[i][1]-y0)*(x1-x0))//(y1-y0)*(xi-x0)=(yi-y0)*(x1-x0) straightlineformula
            {
                return false;
            }
        }
        return true;
    }
}