// Last updated: 2/28/2026, 2:51:45 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        char[] firstWord = strs[0].toCharArray();
4        StringBuilder matches = new StringBuilder();
5
6        for (int j = 0; j < firstWord.length; j++) {
7            for (int i = 0; i < strs.length; i++) {
8                if (j >= strs[i].length() || firstWord[j] != strs[i].charAt(j)) {
9                    return matches.toString();
10                }
11            }
12            matches.append(firstWord[j]);
13        }
14        return matches.toString();
15    }
16}