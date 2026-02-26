// Last updated: 2/26/2026, 3:23:27 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        char[] sSorted = s.toCharArray();
4        char[] tSorted = t.toCharArray();
5
6        Arrays.sort(sSorted);
7        Arrays.sort(tSorted);
8
9        return Arrays.equals(sSorted, tSorted);
10    }
11}