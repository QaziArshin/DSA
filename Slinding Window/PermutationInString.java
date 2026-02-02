class Solution {
    public boolean checkInclusion(String s1, String s2) {
       if(s1.length()>s2.length())
       return false;

       Map<Character,Integer> map = new HashMap<>();

    //    build frequency map for s1

    for(char c :s1.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
    }
    int left =0, right =0;
    int count = s1.length();

    while(right<s2.length()){
        char rchar = s2.charAt(right);
// expand window

        if(map.containsKey(rchar) && map.get(rchar)>0){
            count --;
        }
        map.put(rchar,map.getOrDefault(rchar,0)-1);
        right++;

        // permutation found
        if(count ==0) return true;

        // shrink window when size ==s1.length()

        if(right-left ==s1.length()){
            char lchar = s2.charAt(left);

            if(map.containsKey(lchar) && map.get(lchar)>=0){
                count++;
            }
            map.put(lchar,map.getOrDefault(lchar,0)+1);
            left++;
        }
    }
    return false;
    }
    }
