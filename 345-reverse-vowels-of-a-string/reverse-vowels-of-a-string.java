class Solution 
{
    public String reverseVowels(String s)
    {
        char[] arr = s.toCharArray();
        int l = 0;
        int r = arr.length-1;
        while( l < r){
            while(l<r && !check(arr[l])){
                l++;
            }
            while(l<r && !check(arr[r])){
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
    public boolean check(char a){
        return a=='a' || a=='e' || a=='i'|| a=='o' 
        || a=='u' || a=='A' || a=='E' || a=='I' || a=='U' || a=='O';

    }
}