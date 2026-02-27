// Last updated: 2/26/2026, 10:34:19 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3        char[] digits = String.valueOf(x).toCharArray();
4
5        for (int i = 0; i < digits.length / 2; i++) {
6            if (digits[i] != digits[digits.length - 1 - i]) {
7                return false;
8            }
9        } 
10        return true;
11    }
12}