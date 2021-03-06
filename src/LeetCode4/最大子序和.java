package LeetCode4;

/*给定一个整数数组 nums，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

示例 1：

输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
输出：6
解释：连续子数组[4,-1,2,1] 的和最大，为6 。

示例 2：
输入：nums = [1]
输出：1

示例 3：
输入：nums = [0]
输出：0

示例 4：
输入：nums = [-1]
输出：-1

示例 5：
输入：nums = [-100000]
输出：-100000
*/

public class 最大子序和 {
    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(a));
    }
    // 动态规划
    public static int maxSubArray(int[] nums) {
        int dp = nums[0];
        int max=dp;
        for (int i=1;i< nums.length;i++){
            dp = Math.max(nums[i],dp+nums[i]);
            max = Math.max(max,dp);
        }
        return max;
    }
}
