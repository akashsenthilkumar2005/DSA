class Solution {
    public int countOdds(int low, int high) {
        int h=0;
        if(low%2==0&&high%2!=0){
            low++;
        }
        else if(low%2==0&&high%2==0){
                low++;
                high--;
        }
        else if(low%2!=0&&high%2==0) {
            high--;
        }
        return (high-low)/2+1;
        
    }
}