class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            m.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int comp=target-nums[i];
           
            if(m.containsKey(comp)&& m.get(comp)!=i)
               return new int[]{i,m.get(comp)};
        }
        return new int[]{};
    }
}
