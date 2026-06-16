class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueSet = new HashSet<>();

        for (int n: nums) {
            if (uniqueSet.add(n))
                continue;
            else
                return true;
        }

        return false;
    }
}