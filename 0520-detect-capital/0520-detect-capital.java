class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalcount = 0;
        for (int i=0; i< word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                capitalcount++;
            }
        }
            if(capitalcount == word.length() || capitalcount == 0 || (capitalcount == 1 && Character.isUpperCase(word.charAt(0)))){
                return true;
            }else {
                return false;
            }
           
    }
}
    
