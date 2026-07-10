class Solution {
    public int countKeyChanges(String s) {
        int c=0;
    for(int i=0;i<s.length()-1;i++){
        int a=(int)s.charAt(i);
        int b=(int)s.charAt(i+1);
        if(a!=b+32&&b!=a+32&&a!=b) c++;
    }
    return c;
    }
}