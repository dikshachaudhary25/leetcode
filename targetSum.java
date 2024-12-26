class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<String, Integer> map = new HashMap<>();
        return ways(nums, 0, 0, target,map);
    }
    public int ways(int[] nums, int i, int sum, int target, Map<String, Integer> map){
        if(i==nums.length){
            if(sum == target){
                return 1;
            }
            else{
                return 0;
            }
        }
        String key = i+","+sum;
        if (map.containsKey(key)) {
            return map.get(key);
        }
        int a = ways(nums, i+1, sum+nums[i], target, map);
        int b = ways(nums, i+1, sum-nums[i], target, map);
        map.put(key,a+b);
        return a+b;
    }
}
