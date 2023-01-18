//Optimized Approach using HashMap
  //Time complexity: O(N)
  //Space complexity: O(N)


class Solution {
    public int[] twoSum(int[] n, int target) {
       //Phele HUm hashMap ka use krengy aur nums array ke saare elements with unke indexes
       //(hum indexes isliye store krey h kuki hume return krna h index.
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < n.length; i++){
            mp.put(n[i],i);
        }
        
        int []ans = new int[2];
       //Ab hum loop chalengy aur check krengy ki given target-nums[i] value humare hashmap me 
       //present ha ya nhi...
        for(int i=0 ; i< n.length; i++){
            int check = target - n[i];
            if(mp.containsKey(check) && mp.get(check) != i){
                ans[0] = i;//Agar ha toh ans[0] me i ko store krdengy
                ans[1] = mp.get(check);//aur mp.get(check) ko ans[1] me
                return ans;
             }

        }
        ans[0] = -1;
        ans[1] = -1;
        return ans;
    }
}
