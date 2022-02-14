

class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] ans = new int[k];

        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int[] l : logs) {
            map.putIfAbsent(l[0], new HashSet<>());
            map.get(l[0]).add(l[1]);

        }

        for (int key : map.keySet()) {
            ans[map.get(key).size() - 1]++;
        }
        return ans;
    }
}