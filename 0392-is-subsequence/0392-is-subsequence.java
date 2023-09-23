class Solution {
    public boolean isSubsequence(String s, String t) {
        int lengthOfT=t.length();
        int lengthOfS=s.length();
        StringBuilder string=new StringBuilder();
        int i=0;
        int j=0;
        while(i<lengthOfT && j<lengthOfS){
            char ch1=t.charAt(i);
            char ch2=s.charAt(j);
            if(ch1==ch2){
                string.append(ch1);
                i++;
                j++;
            }
            else {
                i++;
            }
        }
        if(string.toString().equals(s)){
            return true;
        }
        return false;
    }
}