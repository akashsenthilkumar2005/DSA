class Solution 
{
    public String reverseVowels(String s)
    {
        boolean[] vowel = new boolean[128];
        for(char c: "aeiouAEIOU".toCharArray()){
            vowel[c]=true;
        }
        char[] arr = s.toCharArray();
        int l = 0;
        int r = arr.length-1;
        while( l < r){
            while(l<r && !vowel[arr[l]]){
                l++;
            }
            while(l<r && !vowel[arr[r]]){
                r--;
            }
            if(l<r){
                char t=arr[l];
                arr[l]=arr[r];
                arr[r]=t;
                l++;
                r--;
            }
            
        }
        return String.valueOf(arr);
    }
    
}