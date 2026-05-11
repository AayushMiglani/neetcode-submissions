class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] freq = new int[26];
            for (char c : str.toCharArray()) {
                freq[c - 'a']++;
            }

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                builder.append(freq[i]);
                builder.append('#');
            }
            String key = builder.toString();

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>(List.of(str)));
            } else {
                map.get(key).add(str);
            }
        }
        return new ArrayList<>(map.values());
    }
}
