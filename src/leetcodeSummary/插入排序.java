package leetcodeSummary;

import java.util.Arrays;
import java.util.HashMap;

public class 插入排序 {
    public static void main(String[] args) {

        int[] nums = {13,6,5,11,9,8};
        System.out.println(Arrays.toString(f1(nums)));

    }
    // 插入排序
    public static int[] f(int[] nums){
        int t;
        for (int i=0;i< nums.length-1;i++){
            for (int j=i+1;j>0;j--){
                if (nums[j]<nums[j-1]){
                    t = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = t;
                }
            }
        }
        return nums;
    }

    // 折半插入排序
    public static int[] f1(int[] nums){
        int low,high,mid,t;
        for (int i=1;i<nums.length;i++){
            t = nums[i];
            low = 0;
            high = i-1;
            while (low<=high){
                mid = (low+high)/2;
                if (t > nums[mid]){
                    low = mid+1;
                }
                else high = mid -1;
            }
            // 找到插入点后,为了给这个数插入,腾出位子, 包括这个位置的后面的所有的数都要往后移, 但移动的过程中一定要从右往左移动,
            // 因为这样才不会数据丢失, 从左往右移动时,一个接着一个的数据被覆盖
            for (int j=i-1;j>=high+1;j--){
                nums[j+1] = nums[j];
            }
            nums[high+1] = t;
        }
        return nums;
    }
}
