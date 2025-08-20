class Solution {
    public int helper(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.val;
        int ls = helper(root.left);
        if(ls==Integer.MIN_VALUE) return Integer.MIN_VALUE;
        int rs = helper(root.right);
        if(rs==Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if(ls+rs!=root.val) return Integer.MIN_VALUE;
        return root.val;
    }
    public boolean checkTree(TreeNode root) {
        return helper(root) != Integer.MIN_VALUE;
    }
}