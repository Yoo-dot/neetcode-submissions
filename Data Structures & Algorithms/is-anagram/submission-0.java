class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
            return false;
        HashMap<Character,Integer> m=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
           if(!m.containsKey(s.charAt(i)))
            m.put(s.charAt(i),1);
           else
            m.put(s.charAt(i),m.get(s.charAt(i))+1);
        }
        for(int i=0;i<n;i++){
            if (!m.containsKey(t.charAt(i)))
               return false;
            int key=m.get(t.charAt(i));
            m.replace(t.charAt(i),key-1);
        }
        for(int i=0;i<n;i++){
            if(m.get(s.charAt(i))!=0)
             return false;
        }
        return true;
    }
}
