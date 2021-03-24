package TREE.leetcode;

import TREE.leetcode.DayOne.相同的树;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void traverse(TreeNode root){
        if (root==null) return;
        traverse(root.left);
        System.out.println(root.val);
        traverse(root.right);
    }
}
