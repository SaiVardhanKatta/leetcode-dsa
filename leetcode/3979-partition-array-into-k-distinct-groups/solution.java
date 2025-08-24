class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n = nums.length;
        if(n%k != 0){
            return false;
        }
        Map<Integer, Integer> frequency = new HashMap<>();
        for(int num : nums){
            frequency.put(num, frequency.getOrDefault(num,0) + 1);
        }
        for(int count : frequency.values()){
            if(count > n/k){
                return false;
            }
        }
        return true;
    }
}
