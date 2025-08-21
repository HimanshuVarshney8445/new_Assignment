class Solution {
    public boolean helper(TreeNode root,int k,List<Integer> list){
        if(root==null) return false;
        if(list.contains(k-root.val)) return true;
        else{
            list.add(root.val);
        }
        return helper(root.left,k,list) || helper(root.right,k,list);

    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList();
        return helper(root,k,list);
    }
}