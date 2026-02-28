// Last updated: 2/27/2026, 9:54:02 PM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        String[] arrayOfStrings = s.split(" ");
4        String word = "";
5
6        for (int i = arrayOfStrings.length - 1; i >= 0; i--) {
7            if (!arrayOfStrings[i].isEmpty()) {
8                word = arrayOfStrings[i];
9                break;
10            }
11        }
12        return word.length();
13    }
14}