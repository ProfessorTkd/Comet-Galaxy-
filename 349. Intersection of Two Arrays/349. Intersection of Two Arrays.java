//Brute Force Approach using Hashset using array

//Time Complexity = O(N*M), 
//Space Complexity = O(N)
//where N = nums1.length, M = nums2.length



class Solution {
    public int[] intersection(int[] n1, int[] n2) {
        
          HashSet<Integer> set = new HashSet<>();
        for(int i=0; i < n1.length; i++){
            for(int j = 0; j<n2.length ; j++){
                if(n1[i] == n2[j]){
                    set.add(n1[i]);  //sirf unique values ko add krengy
            }
        }
        int arr[] = new int[set.size()];
        int j = 0;         //array me iteration krne ke liye
	   
         for(int i : set){
         arr[j] = i;
         j++;
     }
        return arr;
    }
}
