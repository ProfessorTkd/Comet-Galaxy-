//Optimized Approach using HashSet
//Time Complexity = O(N) 
//Space Complexity = O(N)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    
        if(nums1.length > nums2.length)
            intersection(nums2, nums1);
            
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
    
        for(int num : nums1)
            set.add(num);
            
        for(int i = 0; i < nums2.length; i++)
            if(set.contains(nums2[i]))
                result.add(nums2[i]);

        
        int count = 0;
        int res[] = new int[result.size()];
        for(Integer num : result)
            res[count++] = num;
        
        return res;
        
    }
}
