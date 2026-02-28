// Last updated: 2/28/2026, 4:24:11 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4
5        for (char c : s.toCharArray()) {
6            if (c == '(') {
7                stack.push(')');
8            } else if (c == '[') {
9                stack.push(']');
10            } else if (c == '{') {
11                stack.push('}');
12            } else if (stack.isEmpty() || c != stack.pop()) {
13                return false;
14            }
15        }
16        return stack.isEmpty();
17    }
18}