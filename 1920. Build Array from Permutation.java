class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            nums[i] = nums[i] + n*(nums[nums[i]] % n);
        }
        
        for(int i=0; i<n; i++){
            nums[i] = nums[i]/n;
        }
        
        return nums;
    }
}

// Simple and Clear Solution

class Solution {
    public int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[nums[i]];

        }
        return res;
         
    }
}
