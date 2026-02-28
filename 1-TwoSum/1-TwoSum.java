// Last updated: 2/28/2026, 12:25:04 AM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer, Integer> seen = new HashMap<>();
4
5        for (int i = 0; i < nums.length; i++) {
6            int complement = target - nums[i];
7            if (seen.containsKey(complement)) {
8                return new int[]{seen.get(complement), i};
9            }
10            seen.put(nums[i], i);
11        }
12
13        return new int[]{};
14    }
15}