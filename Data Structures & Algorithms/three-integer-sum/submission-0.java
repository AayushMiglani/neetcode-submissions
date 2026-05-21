class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            // n-2 because we need two elements after i, similarly for j
            for (int j = i+1; j < n - 1; j++) {
                for (int k = j+1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}
