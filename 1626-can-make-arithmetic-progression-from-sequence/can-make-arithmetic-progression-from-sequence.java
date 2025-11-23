import java.util.*;
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length==2) return true;
        Arrays.sort(arr);
        int a1=arr[0],a2=arr[1],diff=arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            if(Math.abs(arr[i]-arr[i-1])!=diff) return false; 
        }
        return true;
    }
}