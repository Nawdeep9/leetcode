class Solution {
    
    public boolean isPalidrome(String s, Integer len) {
        for(Integer i = 0, j = len -1; i <= j; i++, j--) 
            if(s.charAt(i) == s.charAt(j)) continue; 
            else return false;
        return true;
    }
    
    public String checkAllSubStringsOfSpecifiedLen(String s, Integer len) {
        for(Integer i = 0; i+len <= s.length(); i++) {
            String sub = s.substring(i,i+len);
            if(isPalidrome(sub, len))  return sub;
        }
        return "";
    }
    
    public String longestPalindrome(String s) {
        Integer len = s.length();
        if(len < 2) return s;
        for(Integer i = len; i > 0 ; i--){
            String res = checkAllSubStringsOfSpecifiedLen(s, i);
            if(res != "") return res;
        }
        return String.valueOf(s.charAt(0));
    }
}