public class MaxSubArray {
    // O(n) time, O(1) space
    public int maxSubArray(int[] nums) {
        int minPreSum = 0;
        int preSum = 0;
        int maxSubSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            if (preSum - minPreSum > maxSubSum) {
                maxSubSum = preSum - minPreSum;
            } 
            if (preSum < minPreSum) {
                minPreSum = preSum;
            }
        }
        return maxSubSum;
    }
}
