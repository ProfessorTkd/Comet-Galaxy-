 //Brute Force Using Array
 class Solution{
          public int[] twoSum(int[] n, int target) {
              int[] sum = new int[2];
              for (int i = 0; i < n.length; ++i) {
                  for (int j = i + 1; j < n.length; ++j) {
                      if (target == n[i] + n[j]) {
                          sum[0] = i;
                          sum[1] = j;
                          return sum;
                      }
                  }
              }
              return sum;
          }
}     
