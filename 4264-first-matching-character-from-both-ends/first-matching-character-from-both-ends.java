class Solution {
    public int firstMatchingIndex(String s) {
        if(s.length()==1) return 0;
        int n=s.length();
        for(int i=0;i<s.length();i++){
            int t=n-i-1;
            if(!(n-i-1<=0))
            {
                    if(s.charAt(i)==s.charAt(t)) return i;
            }
            else break;
        }
        return -1;
    }
}