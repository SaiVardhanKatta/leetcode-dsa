class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> freq = new HashMap<>();
    for (int n : nums) {
        freq.put(n, freq.getOrDefault(n, 0) + 1);
    }

    List<Integer> list = new ArrayList<>(freq.keySet());
    list.sort((a, b) -> freq.get(b) - freq.get(a));

    int[] res = new int[k];
    for (int i = 0; i < k; i++) {
        res[i] = list.get(i);
    }
    return res;
    }
}
