class Solution {
    public int findLucky(int[] arr) {
        int res=-1,max=-1;

           for (int x : arr) {
            max = Math.max(max, x);
        }

        int[] n = new int[max + 1];
      
        for(int i=0;i<arr.length;i++){
            n[arr[i]]++;
            
        }
        for(int i=0;i<arr.length;i++){
           
            if(arr[i]==n[arr[i]]){
                if(res<arr[i]){
                    res=arr[i];
                }
            }   
        }
        return res;
    }
}