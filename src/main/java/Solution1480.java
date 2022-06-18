/**
 * 一维数组的动态和
 *
 * @author wangzhijie
 */
public class Solution1480 {

    /**
     *  给你一个数组 nums，数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i])
     *  请返回 nums 的动态和
     *
     * @param nums
     * @return
     */
    public static int[] runningSum(int[] nums) {
        // 0 -> 1
        // 1 -> 1 + 2
        int sumNums = 0;
        // 0 -> {1}
        // 1 -> {1 + 2 + 3}
        int[] plusNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sumNums =  sumNums + nums[i];
            plusNums[i] = sumNums;
        }
        return plusNums;
    }

    public static int[] runningSum2(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    /**
     * 输入：nums = [1,2,3,4]
     * 输出：[1,3,6,10]
     * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        runningSum2(nums);
    }
}
