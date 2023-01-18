//Optimized Approach using HashMap
  //Time complexity: O(N)
  //Space complexity: O(N)


class Solution {
    public int[] twoSum(int[] n, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>(); 
        for(int i = 0; i < n.length; i++){
            mp.put(n[i],i);
        }
        
        int []ans = new int[2];
        for(int i=0 ; i< n.length; i++){
            int check = target - n[i];
            if(mp.containsKey(check) && mp.get(check) != i){
                ans[0] = i;
                ans[1] = mp.get(check);
                return ans;
             }

        }
        ans[0] = -1;
        ans[1] = -1;
        return ans;
    }
}
