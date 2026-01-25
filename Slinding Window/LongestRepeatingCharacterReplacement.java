class Solution {
    public int characterReplacement(String s, int k) {
      int left =0, maxlength =0, maxfreq=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq = Math.max(maxfreq,map.get(ch));
            while((right -left)+1 - maxfreq>k){
                char leftchar = s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                left++;
            }
            maxlength = Math.max(maxlength,(right-left)+1);
            
        }
        return maxlength;
    }
}
