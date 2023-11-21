class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> temp=new HashSet<>();
        
        for(int i=0;i<nums2.length;i++){
            set.add(nums2[i]);
        }
        
        for(int i=0;i<nums1.length;i++){
            if(set.contains(nums1[i])){
                temp.add(nums1[i]);
            }
        }
        
        int[] res=new int[temp.size()];
        int index=0;
        for(Integer num:temp){
            res[index++]=num;
        }
        return res;
    }
}