package LeetCode2;


/*给定一个含有n个正整数的数组和一个正整数 target 。

找出该数组中满足其和 ≥ target 的长度最小的 连续子数组[numsl, numsl+1, ..., numsr-1, numsr] ，
并返回其长度。如果不存在符合条件的子数组，返回 0 。

示例 1：

输入：target = 7, nums = [2,3,1,2,4,3]
输出：2
解释：子数组[4,3]是该条件下的长度最小的子数组。
示例 2：

输入：target = 4, nums = [1,4,4]
输出：1
*/
public class 长度最小的子数组 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(minSubArrayLen(11,a));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        if (nums.length==0) return 0;
        int res = 0;
        int i=0,j=0;
        int total = 0;
        while (j<nums.length){
            total += nums[j];
            while (total>=target){
                res = res==0 ? j-i+1 : Math.min(res,j-i+1);
                total-=nums[i];
                i++;
            }
            j++;
        }
        return res;
    }

    public static int maxForGroup(int[] arr,int groupNum){
        int max=0,m=0;
        for (int i=0;i< arr.length-groupNum+1;i++){
            for (int j=i;j<i+groupNum;j++){
                m += arr[j];
            }
            max = max<m?m:max;
            m = 0;
        }
        return max;
    }

}
