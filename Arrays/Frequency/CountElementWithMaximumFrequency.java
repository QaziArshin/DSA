class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
            int currfreq = map.get(i);
        }
        
        int maxfrq =0;
        for(int i : map.values()){
            maxfrq = Math.max(maxfrq,i);
        }
        int count =0;
        for(int i :map.values()){
            if(i == maxfrq){
                count +=i;
            }
        }
        
        return count;
    }
}
