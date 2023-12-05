class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int ans[] = new int[n-k+1];
        
        Deque<Integer> dq=new ArrayDeque<>();
        int index=0;
        
        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.peek()==i-k){
                dq.poll();
            }
            
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            
            dq.add(i);
            if(i>=k-1){
                ans[index++]=nums[dq.peek()];
            }
        }
        
        return ans;
            
            
            
            
            
        // PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        // for(int i=0;i<k;i++){
        //     pq.add(nums[i]);
        // }
        // int[] ans=new int[nums.length-k+1];
        // int index=0;
        // ans[index++]=pq.peek();
        // for(int i=k;i<nums.length;i++){
        //     pq.remove(nums[i-k]);
        //     pq.add(nums[i]);
        //     ans[index++]=pq.peek();
        // }
        // return ans;
    }
}