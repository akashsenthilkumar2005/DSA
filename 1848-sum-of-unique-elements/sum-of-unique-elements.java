class Solution {
    public int sumOfUnique(int[] nums) {
       int[] n=new int[256];
       int s=0;
       for(int i=0;i<nums.length;i++){
            n[nums[i]]++;
            if(n[nums[i]]==1) s+=nums[i];
            if(n[nums[i]]==2) s-=nums[i];
       } 
       return s;
    }
}