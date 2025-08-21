class Solution {
    public TreeNode helper(TreeNode root, int val){
        if(root==null){
            return new TreeNode(val);
        }
        if(val<root.val){
            root.left = helper(root.left,val);
        }else{
            root.right = helper(root.right,val);
        }
        return root;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = root;
        return helper(node,val);
    }
}