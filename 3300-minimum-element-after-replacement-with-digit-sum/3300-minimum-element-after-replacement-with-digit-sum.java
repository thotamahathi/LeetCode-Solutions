class Solution {
    public int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE; // safer initialization
        for (int num : nums) {
            int dig = 0;
            while (num > 0) {
                dig += num % 10;
                num /= 10;
            }
            ans = Math.min(ans, dig);
        }
        return ans;
    }
}
