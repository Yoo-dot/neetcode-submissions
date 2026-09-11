class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr=new int[k];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int i=0;

        
        while(k>0){
            int max=map.keySet().iterator().next();
        for(Map.Entry<Integer,Integer> it: map.entrySet()){
            if(map.get(max)<it.getValue()){
                max=it.getKey();
            }
        }
        arr[i]=max;
        i++;
        map.remove(max);
        k--;
        }
        return arr;
    }
}
