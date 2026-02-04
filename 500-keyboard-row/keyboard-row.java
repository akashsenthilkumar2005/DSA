class Solution {
    public String[] findWords(String[] words) {
        String firstrow="qwertyuiop";
        String secondrow="asdfghjkl";
        String thirdrow="zxcvbnm";
    List<String> result = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int x=0,y=0,z=0;
            String a=words[i].toLowerCase();
            for(int j=0;j<a.length();j++){
                if(firstrow.indexOf(a.charAt(j))!=-1) x++;
                else if(secondrow.indexOf(a.charAt(j))!=-1) y++;
                else if(thirdrow.indexOf(a.charAt(j))!=-1) z++;
            }
            if((x==0&&y==0&&z>0)||(x==0&&z==0&&y>0)||(y==0&&z==0&&x>0)){
                 result.add(words[i]);
            }
        }
         return result.toArray(new String[0]);
    }
}