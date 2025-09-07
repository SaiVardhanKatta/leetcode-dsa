class Solution {
    public int minOperations(String s) {
        String charString = s;
        int maxSteps = 0;
        for(char c : charString.toCharArray()){
            int steps = (26 - (c - 'a')) % 26;
            maxSteps = Math.max(maxSteps, steps);
        }
        return maxSteps;
    }
}
