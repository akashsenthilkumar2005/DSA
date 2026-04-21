class Solution {
    public String reversePrefix(String word, char ch) 
    {
        int h=word.indexOf(ch);
        if(h==-1) return word;
        String f=word.substring(0,h+1);
        String s=word.substring(h+1,word.length());
        f=rev(f);
        return (f+s);
    }
    public String rev(String s){
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);
        }
        return r;
    }
}