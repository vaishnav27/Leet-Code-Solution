class Solution {
    public boolean search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (nums[mid] == target) {
                return true;
            } 
            if(nums[lo]==nums[mid] && nums[hi]==nums[mid]){
                lo++;
                hi--;
            }
            else if (nums[mid] >= nums[lo]) {
                if (target >= nums[lo] && target <= nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (target >= nums[mid] && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return false;
    }
}
