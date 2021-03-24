package TREE.leetcode.DayTow;

import TREE.leetcode.TreeNode;

public class 是否为平衡二叉树 {

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(4);
        TreeNode t6 = new TreeNode(4);
        p.left = t1;
        p.right = t2;
        t1.left=t3;
        t1.right=t4;
        t3.left=t5;
        t3.right = t6;
        System.out.println(isBalanced(p));
    }

    public static boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        if (root.left==null&&root.right==null) return true;

        int leftDepth = 二叉树的最大深度.maxDepth(root.left);
        int rightDepth = 二叉树的最大深度.maxDepth(root.right);
        if (Math.abs(rightDepth-leftDepth)<=1) return true;
        else return false;
    }
}
