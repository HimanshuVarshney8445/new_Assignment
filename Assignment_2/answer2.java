class Solution {
    public TreeNode leftLast(TreeNode root){
        if(root.right==null){
            return root;
        }
        return leftLast(root.right);
    }
    public TreeNode helper(TreeNode node){
        if(node.left==null) return node.right;
        else if(node.right==null) return node.left;
        TreeNode right_child = node.right;
        TreeNode left_Last = leftLast(node.left);
        left_Last.right = right_child;
        return node.left;
    }
    public TreeNode deleteNode(TreeNode node, int key) {
        if(node==null) return node;
        if(node.val==key) return helper(node);
        TreeNode root = node;
        while(root!=null){
            if(root.val>key){
                if(root.left!=null && root.left.val==key){
                    root.left=helper(root.left);
                    break;
                }else{
                    root=root.left;
                }
            }else{
                if(root.right!=null && root.right.val==key){
                    root.right=helper(root.right);
                    break;
                }else{
                    root=root.right;
                }
            }
        }
        return node;
    }
}