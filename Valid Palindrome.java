class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder s1 = new StringBuilder();
        String lower = s.toLowerCase();
        for(int i = 0 ;i<lower.length();i++){
            if(Character.isLetter(lower.charAt(i))){
                s1.append(lower.charAt(i));
            }
            if(Character.isDigit(lower.charAt(i))){
                s1.append(lower.charAt(i));
            }
        }


        int i =0;
        int j = s1.length()-1;
        while(i<s1.length()/2){
            if(s1.charAt(i)!=(s1.charAt(j))){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
