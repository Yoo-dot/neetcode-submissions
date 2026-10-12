class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            
            char[] s=strs[i].toCharArray();
            Arrays.sort(s);
            String str=new String(s);
            if(! map.containsKey(str)){
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(strs[i]);
        }
        for(Map.Entry<String,List<String>> it : map.entrySet()){
            ans.add(it.getValue());
        }
        
        return ans;
    }
   
}
