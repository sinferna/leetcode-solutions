// Last updated: 2/27/2026, 5:43:01 PM
1class Solution {
2    public int romanToInt(String s) {
3        char[] intArray = s.toCharArray();
4        int value = 0;
5
6
7        Map<Character, Integer> map = new HashMap<>();
8
9        map.put('I', 1);
10        map.put('V', 5);
11        map.put('X', 10);
12        map.put('L', 50);
13        map.put('C', 100);
14        map.put('D', 500);
15        map.put('M', 1000);
16
17        for (int i = 0; i < intArray.length - 1; i++) {
18            if (map.get(intArray[i]) >= map.get(intArray[i+1])) {
19                value += map.get(intArray[i]);
20            } else {
21                value -= map.get(intArray[i]);
22            }
23         }
24        value += map.get(intArray[intArray.length - 1]);
25        return value;
26    }
27}