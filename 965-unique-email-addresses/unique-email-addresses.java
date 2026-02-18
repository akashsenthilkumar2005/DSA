class Solution {
    public int numUniqueEmails(String[] emails) {
        String[] s=new String[emails.length];
        for(int i=0;i<emails.length;i++){
            String[] a=emails[i].split("@");
            String local=a[0];
            String domain=a[1];
            int ind=local.indexOf('+');
            if(ind!=-1){
                local=local.substring(0,ind);
            }
            local=local.replace(".","");
            s[i]=(local+"@"+domain);
        }
        Arrays.sort(s);
        int j=1;
        for(int i=0;i<s.length-1;i++){
            if((!s[i].equals(s[i+1]))){
                j++;
                
            }
        }
        return j;
    }
}