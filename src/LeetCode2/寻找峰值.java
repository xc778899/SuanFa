package LeetCode2;

public class 寻找峰值 {
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(f(nums));
    }

    public static int f(int[] nums){
        int l=0,r= nums.length-1;
        int m = 0;
        while (l<r){
            m = (l+r)/2;
            if (nums[m]>=nums[m+1]){
                r = m;
            }
            else l = m+1;
        }
        return l;
    }
}
