package TREE.leetcode.DayTow;


import TREE.leetcode.TreeNode;

/*给定一个二叉树，找出其最大深度。

二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。

说明:叶子节点是指没有子节点的节点。

示例：
给定二叉树 [3,9,20,null,null,15,7]，

    3
   / \
  9  20
    /  \
   15   7
返回它的最大深度3 。

*/
public class 二叉树的最大深度 {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(30);
        p.left = t1;
        p.right = t2;
        t1.left = null;
        t1.right = t3;
        t2.left = t4;
        t2.right = null;


        System.out.println(maxDepth(p));
    }

    public static int maxDepth(TreeNode root) {
        if (root==null) return 0;
        if (root.left==null&&root.right==null) return 1;

        int ld = maxDepth(root.left);
        int rd = maxDepth(root.right);

        return Math.max(ld,rd)+1;
    }
}
