class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a=new int[nums1.length+nums2.length];
        for(int i=0;i<a.length;i++){
            if(i<nums1.length){
                a[i]=nums1[i];
            }
            else{
                a[i]=nums2[i-nums1.length];
            }
        }
        Arrays.sort(a);
        if(a.length==1) return (double)a[0];
        int n=a.length;
        if(n%2==1) return (double)a[n/2];
        return (double)(a[n/2-1]+a[n/2])/(double)2; 
    }
}