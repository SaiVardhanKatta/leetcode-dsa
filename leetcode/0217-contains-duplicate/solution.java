class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Optimal, Use HashSet - Sets: No duplictes
        // Hashing use O(1) T.C for lookup operation
        Set<Integer> exists = new HashSet<>();
        for(int num : nums){
            if(exists.contains(num)){
                return true;
            }
            exists.add(num);
        }
        return false;
    }
}
