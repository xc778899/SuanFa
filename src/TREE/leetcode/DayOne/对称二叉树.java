package TREE.leetcode.DayOne;

import TREE.leetcode.TreeNode;

/*给定一个二叉树，检查它是否是镜像对称的。

例如，二叉树[1,2,2,3,4,4,3] 是对称的。

    1
   / \
  2   2
 / \ / \
3  4 4  3


但是下面这个[1,2,2,null,3,null,3] 则不是镜像对称的:

    1
   / \
  2   2
   \   \
   3    3
*/
public class 对称二叉树 {

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(3);
        p.left = t1;
        p.right = t2;
        t1.left = null;
        t1.right = t3;
        t2.left = t4;
        t2.right = null;

        System.out.println(isSymmetric(p));
    }
    public static boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        return cmp(root.left,root.right);
    }


    // 最重要的一个点 : 分头判断 : 一次判断两颗子树, 左右孩子是否对称,
    // 这两个节点一定要满足node1的左孩子的值要等于node2的右孩子的值,并且,node1的右孩子的值, 要等于node2的左孩子的值
    private static boolean cmp(TreeNode left, TreeNode right) {
        if (left==null&&right==null) return true;

        if (left!=null && right!=null && (left.val == right.val)){
            boolean l = cmp(left.left, right.right);
            boolean r = cmp(left.right,right.left);
            return l&&r;
        }else return false;
    }
}
