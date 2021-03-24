package LeetCode1;

public class 搜索插入位置 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int i=0,j=nums.length-1,mid=0;
        // 用二分法找到target的插入位置
        while (i<=j){
            mid =  (i+j)/2;
            if (nums[mid]>=target){
                j = mid-1;
            }
            else
                i = mid+1;
        }
        // 无论什么情况, 插入位置永远是在j+1的位置
        return j+1;
    }
}
