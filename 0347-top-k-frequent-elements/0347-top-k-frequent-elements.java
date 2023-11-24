class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
         
        List<Integer> bucket[] = new ArrayList[nums.length + 1];
        
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        
        int res[] = new int[k];
        int index = 0;
        for(int i = bucket.length - 1; i >= 0; i--){
            if(bucket[i] != null){
                for(int val : bucket[i]){
                    res[index++] = val;
                    if(index == k) return res;
                }
            }
        }
        return res;
      
//         HashMap<Integer,Integer> map=new HashMap<>();
        
//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//         }
        
//         PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
//         for(int key: map.keySet()){
//             pq.add(key);
//         }
//         int[] res=new int[k];
//         for(int i=0;i<k;i++){
//             res[i]=pq.poll();
//         }
        
//         return res;
    }
}