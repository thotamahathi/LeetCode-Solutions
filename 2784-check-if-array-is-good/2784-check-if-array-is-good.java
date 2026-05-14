class Solution {
    public boolean isGood(int[] nums) {
        int n = 0;
        for (int num : nums) {
            if (num > n) n = num; // find max element
        }

        // Length must be n + 1
        if (nums.length != n + 1) {
            return false;
        }

        // Frequency array (values up to 200)
        int[] freq = new int[201];
        for (int num : nums) {
            freq[num]++;
        }

        // Check 1..n-1 appear exactly once
        for (int i = 1; i < n; i++) {
            if (freq[i] != 1) {
                return false;
            }
        }

        // Check n appears exactly twice
        if (freq[n] != 2) {
            return false;
        }

        return true;
    }
}
