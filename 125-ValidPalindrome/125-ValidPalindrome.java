// Last updated: 3/1/2026, 6:17:41 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        String letters = s.toLowerCase();
4        letters = letters.replaceAll("[^a-z0-9]", "");
5
6        for (int i = 0; i < letters.length() / 2; i++) {
7            int j = letters.length() - 1 - i;
8            if (letters.charAt(j) != letters.charAt(i)) {
9                return false;
10            }
11        }
12        return true;
13    }
14}