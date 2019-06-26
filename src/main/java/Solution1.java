/**
 * @author Wangzj
 * @date 2019/6/26 11:49
 */
public class Solution1 {

    public static int[] twoSum(int[] nums, int target){
        for (int i=0; i<nums.length; i++) {
            for (int j=nums.length-1; j<nums.length; j--) {
                if (j<0) {
                    break;
                }
                if (nums[i]+nums[j]==target && i!=j) {
                    System.out.println("["+i+","+j+"]");
                    System.out.println(nums[i]);
                    System.out.println(nums[j]);
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        twoSum(nums,target);
    }
}
