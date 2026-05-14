class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        String l = s.toLowerCase();

        while (left < right) {
            if (l.charAt(left) == l.charAt(right)) {
                left++;
                right--;
            } else if (!Character.isLetterOrDigit(l.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(l.charAt(right))) {
                right--;
            } else {
                return false;
            }
        }

        return true;
    }
}
