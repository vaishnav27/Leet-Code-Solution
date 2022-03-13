

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == key) {
                    if (Math.abs(i - j) <= k) {
                        ans.add(i);
                        break;
                    }
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
