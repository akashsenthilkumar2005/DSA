class Solution {
    public String reverseOnlyLetters(String s) {
        String a=s.replaceAll("[^a-zA-Z]", "");
        String r="";
        int j=a.length()-1;
        for(int i=0;i<s.length();i++){
            if (((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z')) || 
    ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z'))) {
                    r+=a.charAt(j);
                    j--;
            }
            else
            {
                r+=s.charAt(i);
            }
        }
        return r;
    }
}