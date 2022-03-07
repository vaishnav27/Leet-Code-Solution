

class Solution {
    public void recrPermuatate(int[] arr, List<List<Integer>> ans, List<Integer> ds, boolean[] freq) {

        if (ds.size() == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(arr[i]);
                recrPermuatate(arr, ans, ds, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> ds = new ArrayList<>();

        boolean[] freq = new boolean[nums.length];
        recrPermuatate(nums, ans, ds, freq);
        return ans;
    }
}
