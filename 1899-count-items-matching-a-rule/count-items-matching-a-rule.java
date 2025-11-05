class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i=0,c=0;
        if (ruleKey.equals("type")) i = 0;
        else if (ruleKey.equals("color")) i = 1;
        else if (ruleKey.equals("name")) i = 2;
        for(List<String> x:items){
            if(x.get(i).equals(ruleValue))c++;
        }
        return c;
    }
}