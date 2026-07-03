class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Frequency Map..
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num:nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Init a Min-Heap based on Map
        PriorityQueue<Integer> minHeap = new PriorityQueue(
            (a,b) -> Integer.compare(countMap.get(a), countMap.get(b))
        );

        // Filter for k..
        for (int num: countMap.keySet()) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove..
            }
        }

        int[] result = new int[k];
        for (int i =0; i<k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}
