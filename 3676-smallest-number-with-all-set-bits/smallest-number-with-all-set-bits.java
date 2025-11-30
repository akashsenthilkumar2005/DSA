class Solution {
    
public int smallestNumber(int n) {
        double a=0;
        for(int i=1;i<=10;i++){
             a=Math.pow(2,i)-1;
            if(n<=((int)a)) break;
        }
        return (int)a;
    }
}