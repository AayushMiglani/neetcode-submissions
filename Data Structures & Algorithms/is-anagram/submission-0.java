class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> freqS = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqS.put(c, freqS.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> freqT = new HashMap<>();
        for (char c : t.toCharArray()) {
            freqT.put(c, freqT.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> e : freqS.entrySet()) {
            if (!Objects.equals(freqT.get(e.getKey()), e.getValue())) {
                return false;
            }
        }
        return s.length() == t.length();
    }
}
