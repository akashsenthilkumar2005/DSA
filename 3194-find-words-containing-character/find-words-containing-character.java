class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> a=new ArrayList<>();
        int i=0;
        for(String s:words){
            if(s.indexOf(x)!=-1){
                a.add(i);
            }
            i++;
        }
        return a;
    }
}