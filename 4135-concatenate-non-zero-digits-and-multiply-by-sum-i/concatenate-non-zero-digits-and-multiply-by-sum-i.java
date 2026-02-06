class Solution 
{
    public long sumAndMultiply(int n) 
    {
        long sum=0,t=n,res=0;
        while(t!=0)
        {
            long mod=t%10;
            if(mod!=0)  res=res*10+mod;
            sum+=mod;
            t/=10;
        }
        t=res;
        res=0;
         while(t!=0)
        {
            long mod=t%10;
            if(mod!=0)  res=res*10+mod;
            t/=10;
        }
        return sum*res;
    }
}