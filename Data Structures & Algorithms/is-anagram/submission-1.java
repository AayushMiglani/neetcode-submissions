class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) freq.merge(c, 1, Integer::sum);
        for (char c : t.toCharArray()) freq.merge(c, -1, Integer::sum);

        for (int count : freq.values()) {
            if (count != 0)
                return false;
        }
        return true;
    }
}
