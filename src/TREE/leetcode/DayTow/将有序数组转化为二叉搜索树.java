package TREE.leetcode.DayTow;

import TREE.leetcode.TreeNode;

public class 将有序数组转化为二叉搜索树 {
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        TreeNode.traverse(sortedArrayToBST(nums));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return nums.length==0?null:buildNode(nums,0, nums.length-1);
    }

    public static TreeNode buildNode(int[] nums,int l, int r){
        if (l>r) return null;

        int mid = (l+r)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildNode(nums, l, mid-1);
        root.right = buildNode(nums, mid+1, r);

        return root;
    }
}
