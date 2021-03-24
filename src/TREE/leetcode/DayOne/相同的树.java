package TREE.leetcode.DayOne;

import TREE.leetcode.TreeNode;

public class 相同的树 {

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        TreeNode t1 = new TreeNode(10);
        TreeNode t2 = new TreeNode(20);
        TreeNode t3 = new TreeNode(30);
        t1.right = t3;
        p.left = t1;
        p.right = t2;


        TreeNode q = new TreeNode(1);
        q.left = t1;
        q.left = t2;

        System.out.println(isSameTree(p,q));

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null&&q==null) return true;

        if (p!=null&&q!=null&&p.val==q.val){
            boolean l = isSameTree(p.left,q.left);
            boolean r = isSameTree(p.right,q.right);
            return l&&r;
        }else {
            return false;
        }
    }


}
