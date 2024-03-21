class Solution {
     
    public String computeSizeNConvert(String s) { 
        String out = "";
        Integer size = s.length(); 
        char prev = s.charAt(0);  
        int count = 1;
        for(Integer i = 1; i< size; i++) { 
            char c = s.charAt(i);  
            if(c == prev) count++; 
            else {
                out = out + count + prev; 
                count = 1; 
            }
            prev = c; 
        }
        
        return out + count + prev; 
    }
    
    public String countAndSay(int n) {        
        if(n == 1) return "1";
        return computeSizeNConvert(countAndSay(n -1)); 
    }
}