class Solution 
{
    public String longestPalindrome(String s) 
    {
        String a="";
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                String sub=s.substring(i,j+1);
                if(isplaindrome(sub)&&sub.length()>a.length())
                {
                    a=sub;
                }
            }
        } 
        return a;   
    }
    public boolean isplaindrome(String b){
        int l=0,r=b.length()-1;
        while(l<r){
            if(b.charAt(l)!=b.charAt(r)) return false;
            l++;r--;
        }
        return true;
    }
  
}