class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] a=new int[256];
        for(int i=0;i<sentence.length();i++){
            a[sentence.charAt(i)]++;
        }
        for(int i=97;i<=122;i++){
            if(a[(char)i]==0) return false;
        }
        return true;
       
    }
}