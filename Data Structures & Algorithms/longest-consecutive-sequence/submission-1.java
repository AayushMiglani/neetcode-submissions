class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;

        for (int num : set) {
            int length = 1;
            while (set.contains(num + length)) {
                length += 1;
            }
            max = Math.max(max, length);
        }

        return max;
    }
}
