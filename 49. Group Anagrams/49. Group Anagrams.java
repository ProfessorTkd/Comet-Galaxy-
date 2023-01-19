class Solution1 {
        // TC - O(n * d log d)
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap();
            for (String s : strs) {
                char[] c = s.toCharArray();
                Arrays.sort(c);
                String key = new String(c);
                map.computeIfAbsent(key, k -> new ArrayList()).add(s);
            }

            return new ArrayList(map.values());
        }
    }


class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs){
        List<List<String>>s=new ArrayList<>();
        Map<String,List<String>>map=new LinkedHashMap<>();
        
        for(String e:strs){
            char ch[]=e.toCharArray();
            Arrays.sort(ch);
            String str=new String(ch);
            
            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(e);
        }
        s.addAll(map.values());
        return s;
    }
}
