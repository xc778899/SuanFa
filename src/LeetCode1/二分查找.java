package LeetCode1;

public class 二分查找 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 3;
        System.out.println(f(nums, target));
    }

    public static int f(int[] nums,int target){

        int i=0,j=nums.length-1,mid;
        while (i<=j){
            mid =  (i+j)/2;
            if (nums[mid]>target){
                j = mid-1;
            }
            else if (nums[mid]<target){
                i = mid+1;
            }
            else return mid;
        }
        return -1;
    }
}
