// Approach
// Take 3 Pointers low = 0, mid = 0 and high = nums.length -1;
// Use loop to iterate the array with condition mid <= high.(Since we only need to check middle elements of low and high).
// if element is 0 swap with low and low++, mid++.
// if element is 1 then mid++.
// if element is 2 then swap with high and high--.

//Time complexity: O(N), 
//Space complexity: O(1).

class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0 ){
                //swap with left
                swap(nums,low, mid );
                low++;
                mid++;
            }else if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }else{
                mid++;
            }
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
