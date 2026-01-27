class Solution {
    public boolean isValid(String s) {
        if(s.length()==1) return false;
        Stack<Character> ch = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='[') {
                ch.push(c);
            }
            else{
                if(ch.isEmpty()) return false;
                 char comp=ch.pop();
                
                if(c==')'&&comp!='(') return false;
                if(c=='}'&&comp!='{') return false;
                if(c==']'&&comp!='[') return false;
            }
        }
        return ch.isEmpty();
    }
}