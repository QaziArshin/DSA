class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums ==null || k ==0) 
        return new int[0];
        int[] result =new int[nums.length-k+1];
        Deque<Integer> dq = new ArrayDeque<>(); //store indices
        int left =0;
        for(int  right =0;right<nums.length;right++){

            //  Remove smaller elements from back

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[right]){
                dq.pollLast();
            }
            // Add current index
            dq.offerLast(right);

            // Remove out-of-window elements from front
            if(dq.peekFirst()<left){
                dq.pollFirst();
            }

            // If window size == k, record max and slide window
            if((right-left)+1==k){
                result[left] = nums[dq.peekFirst()];
                left++;
            }
        }
        return result;

    }
}
