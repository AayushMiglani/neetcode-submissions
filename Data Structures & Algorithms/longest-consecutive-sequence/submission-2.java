class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int num : nums) {
            if (map.containsKey(num))
                continue;

            int left = map.getOrDefault(num - 1, 0);
            int right = map.getOrDefault(num + 1, 0);
            int total = left + right + 1;
            if (total > max) {
                max = total;
            }

            map.put(num, total);
            map.put(num - left, total);
            map.put(num + right, total);
        }

        return max;
    }
}
