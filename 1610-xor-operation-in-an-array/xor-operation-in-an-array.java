class Solution {
        public int xorOperation(int n, int start) 
    {
        int  i = 1, next = start + 2;
        while (i != n) 
        {
           start = start ^ next;
            i++;
            next += 2;
        }
        return start;
    }
}