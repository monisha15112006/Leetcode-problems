class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        boolean tep=true;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!=' ' && tep){
                count++;
                tep=false;
            }
            else if(tep){
                continue;
            }
            else if(ch!=' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
