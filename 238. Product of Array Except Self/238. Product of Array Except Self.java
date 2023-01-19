class Solution {
    public int[] productExceptSelf(int[] nums) {
        int multi=1 ;
        int[] right = new int[nums.length] ;
        for(int i=right.length-1 ; i>=0 ; i--){    // filling right array right to left 
            multi=multi*nums[i] ; 
            right[i]=multi ;
        }
            
        int res[] = new int[nums.length] ;     
        int multt=1 ;                           // multiply=1 here 
        for(int i=0 ; i<nums.length-1 ; i++){  //multiplying (multiply)*(right[i+1]) then filling in res[i] array then update multiply*=nums[i]
            res[i]=right[i+1]*multt ;
            multt=multt*nums[i] ;
        }
        res[res.length-1]=multt ; 
        
        return res ;
    }
}
