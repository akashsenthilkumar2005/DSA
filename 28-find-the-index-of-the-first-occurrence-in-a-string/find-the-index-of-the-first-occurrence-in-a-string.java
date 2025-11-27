class Solution {
    public int strStr(String haystack, String needle) {
        boolean t=haystack.contains(needle);
        if(t) return haystack.indexOf(needle);
        else return -1;
    }
}