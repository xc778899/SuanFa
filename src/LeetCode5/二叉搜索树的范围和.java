package LeetCode5;

public class 二叉搜索树的范围和 {

    public static void main(String[] args) {

        int[] a = {10,5,15,3,7,13,18,1,-1,6};
        TreeNode t = TreeNode.create(a, 0, 6);
        TreeNode.traverse(t);
    }

    private static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }

       public static TreeNode create(int[] arr,int index,int n){
           TreeNode tnode = null;
           if (index<n&&arr[index]!=-1){
               tnode = new TreeNode(arr[index]);
               tnode.left = create(arr,2*index+1,n);
               tnode.right = create(arr,2*index+2,n);
           }
           return tnode;
       }

       public static void traverse(TreeNode t) {
           if (t!=null){
               traverse(t.left);
               System.out.print(t.val+"->");
               traverse(t.right);
           }
       }

    }
}

