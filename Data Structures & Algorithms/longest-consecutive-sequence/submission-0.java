class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        Set<Integer> start = new HashSet<>(nums.length);
        for (int num : nums) {
            set.add(num);
            start.add(num);
        }

        for (int num : nums) {
            if (set.contains(num - 1)) {
                start.remove(num);
            }
        }

        int max = 0;
        int sum = 0;

        for (int num : start) {
            sum += 1;
            while (set.contains(num + 1)) {
                sum += 1;
                num += 1;
            }
            max = Math.max(max, sum);
            sum = 0;
        }

        return max;
    }
}
