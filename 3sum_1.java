class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Integer size = nums.length;
        Set<List<Integer>> results = new HashSet<>();
        if(size < 3) return new ArrayList<>();
        for(Integer i = 0; i < size; i++) {
            Integer num1 = nums[i]; 
            Set<Integer> complimentSet = new HashSet<>(); 
            for(Integer j = i+1; j < size; j++) {
                Integer num2 = nums[j]; 
                Integer num3 = 0 - num1 - num2;
                if(complimentSet.contains(num2)) {
                    List<Integer> element = sort(num1, num2, num3);  
                    results.add(element); 
                    complimentSet.remove(num2); 
                } else {
                    complimentSet.add(num3); 
                }
            }
        }
        return new ArrayList<>(results);
    }
    
    public List<Integer> sort(Integer num1, Integer num2, Integer num3) {
        Integer low = 0; 
        Integer mid = 0; 
        Integer high = 0; 
        if(num1 > num2) {  
            if(num1 > num3) {
                high = num1; 
                if(num2 > num3){
                    mid = num2;
                    low = num3;
                } else {
                    mid = num3;
                    low = num2;
                }
            } else {
                high = num3;
                mid = num1;
                low = num2;
            }
        } else {
            if(num2 > num3) {
                high = num2; 
                if(num1 > num3){
                    mid = num1;
                    low = num3;
                } else {
                    mid = num3;
                    low = num1;
                }
            } else {
                high = num3; 
                mid = num2; 
                low = num1;
            }
        }
        
        return Arrays.asList(low,mid,high);
    }
}
