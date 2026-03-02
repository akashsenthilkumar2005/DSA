class Solution {
    public String replaceDigits(String s) {
        String r="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0'&&ch<='9'){
                    r+=(char)((s.charAt(i-1))+(ch-'0'));
            }
            else{
                r+=ch;
            }
        }
        return r;
    }
}